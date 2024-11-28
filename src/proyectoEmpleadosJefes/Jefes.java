package proyectoEmpleadosJefes;

public class Jefes extends Empleados {
	
	private static int plus = 250;
	private String nomDEpartamento;
	
	public Jefes () {
		super();
		this.nomDEpartamento="";
	}

	

	public static int getPlus() {
		return plus;
	}

	public static void setPlus(int plus) {
		Jefes.plus = plus;
	}

	public String getNomDEpartamento() {
		return nomDEpartamento;
	}

	public void setNomDEpartamento(String nomDEpartamento) {
		this.nomDEpartamento = nomDEpartamento;
	}

	@Override
	public String toString() {
		return "Jefes [nomDEpartamento=" + nomDEpartamento + ", toString()=" + super.toString() + "]";
	}
	@Override
	public double incrementar() {
		// TODO Auto-generated method stub
		return super.incrementar() + plus;
	}

}
