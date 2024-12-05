package profesorUni;

public class Listado implements Comparable<Listado> {
	
	
	private String depar;
	private String nombreProfe;
	private int num;
	
	public Listado (String depar, String nombreProfe, int num)  { 
		this.depar="";
		this.nombreProfe="";
		this.num=0;
	}
	
	public String getDepar() {
		return depar;
	}
	public void setDepar(String depar) {
		this.depar = depar;
	}
	public String getNombreProfe() {
		return nombreProfe;
	}
	public void setNombreProfe(String nombreProfe) {
		this.nombreProfe = nombreProfe;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Listado [depar=" + depar + ", nombreProfe=" + nombreProfe + ", num=" + num + ", toString()="
				+ super.toString() + "]";
	}
	
	@Override
	public int compareTo(Listado o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
