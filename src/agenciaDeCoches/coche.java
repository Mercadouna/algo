package agenciaDeCoches;

public class coche extends AgenciaCoches{
	private boolean descapotable;
	
	public coche () {
		super();
		this.descapotable=false;
	}

	public boolean isDescapotable() {
		return descapotable;
	}

	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}

	@Override
	public String toString() {
		return "coche [descapotable=" + descapotable + ", matricula=" + matricula + ", marca=" + marca + ", modelo="
				+ modelo + ", añosDeAntiguedad=" + añosDeAntiguedad + ", precioAlquilerPorDia=" + precioAlquilerPorDia
				+ "]";
	}
	
	
		
	}
	
	

