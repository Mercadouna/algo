package agenciaDeCoches;

public class Furgoneta extends AgenciaCoches {
	
	private double altura;
	private double tara;
	private static double Carga=500;
	
	
	public static void setCarga(double carga) {
		Carga = carga;
	}


	public Furgoneta() {
		super();
		this.altura=0;
		this.tara=0;
		
	}


	@Override
	public String toString() {
		return "Furgoneta [altura=" + altura + ", tara=" + tara + ", matricula=" + matricula + ", marca=" + marca
				+ ", modelo=" + modelo + ", añosDeAntiguedad=" + añosDeAntiguedad + ", precioAlquilerPorDia="
				+ precioAlquilerPorDia + "]";
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getTara() {
		return tara;
	}


	public void setTara(double tara) {
		this.tara = tara;
	}


	public static double getCarga() {
		return Carga;
	}

}
