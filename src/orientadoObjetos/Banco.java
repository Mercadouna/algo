package orientadoObjetos;

public class Banco {
		private String titular;
		private int cantidad;
		
	public Banco () {
		this.titular="";
		this.cantidad=0;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(double d) {
		this.cantidad = (int) d;
	}

	@Override
	public String toString() {
		return "Banco [titular=" + titular + ", cantidad=" + cantidad + "]";
	}

	public void ingresar(double dinero) {
		// TODO Auto-generated method stub
		
	}

	public void retirar(int i) {
		// TODO Auto-generated method stub
		
	} 
	
		
	}
	
	

