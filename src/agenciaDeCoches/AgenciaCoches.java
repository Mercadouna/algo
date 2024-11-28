package agenciaDeCoches;

public class AgenciaCoches {

	protected String matricula;
	protected String marca;
	protected String modelo;
	protected static final String COLOR="negro"; 
	protected int añosDeAntiguedad;
	protected int precioAlquilerPorDia;
	protected static int contador=0;
	
	public AgenciaCoches () {
		this.matricula="";
		this.marca="";
		this.modelo="";
		this.añosDeAntiguedad=0;
		this.precioAlquilerPorDia=0;
	}

	@Override
	public String toString() {
		return "AgenciaCoches [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + 
				", añosDeAntiguedad=" + añosDeAntiguedad + ", precioAlquilerPorDia=" + precioAlquilerPorDia + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public static String getColor() {
		return COLOR;
	}

	public int getAñosDeAntiguedad() {
		return añosDeAntiguedad;
	}

	public void setAñosDeAntiguedad(int añosDeAntiguedad) {
		this.añosDeAntiguedad = añosDeAntiguedad;
	}

	public int getPrecioAlquilerPorDia() {
		return precioAlquilerPorDia;
	}

	public void setPrecioAlquilerPorDia(int precioAlquilerPorDia) {
		this.precioAlquilerPorDia = precioAlquilerPorDia;
	}
	
}
