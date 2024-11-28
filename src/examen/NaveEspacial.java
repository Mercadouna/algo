package examen;

public class NaveEspacial {

	private String Nombre;
	private int AñoCreacion;
	private int AñoLanzamiento;
	private int CapTot;
	private int NumTrip;
	
	public NaveEspacial() {
		this.Nombre = "";
		this.AñoCreacion = 0;
		this.AñoLanzamiento = 0;
		this.CapTot = 0;
		this.NumTrip = 0;
	}
	
	
	@Override
	public String toString() {
		return "NaveEspacial [Nombre=" + Nombre + ", AñoCreacion=" + AñoCreacion + ", AñoLanzamiento=" + AñoLanzamiento
				+ ", CapTot=" + CapTot + ", NumTrip=" + NumTrip + "]";
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public int getAñoCreacion() {
		return AñoCreacion;
	}


	public void setAñoCreacion(int añoCreacion) {
		AñoCreacion = añoCreacion;
	}


	public int getAñoLanzamiento() {
		return AñoLanzamiento;
	}


	public void setAñoLanzamiento(int añoLanzamiento) {
		AñoLanzamiento = añoLanzamiento;
	}


	public int getCapTot() {
		return CapTot;
	}


	public void setCapTot(int capTot) {
		CapTot = capTot;
	}


	public int getNumTrip() {
		return NumTrip;
	}


	public void setNumTrip(int numTrip) {
		NumTrip = numTrip;
	}


	public NaveEspacial(String nom, int ac, int al, int ct, int nt) {
		this.Nombre = nom;
		this.AñoCreacion = ac;
		this.AñoLanzamiento = al;
		this.CapTot = ct;
		this.NumTrip = nt;
	
	
	
}
	
	public int calcularAntigurdad() {
		int antig=0;
		antig = 2024-this.AñoCreacion;
		return antig;
	}
	public boolean admitePasajeros() {
		boolean admit=true;
		if(this.NumTrip>=this.CapTot) {
			admit=false;
		}
		return admit;
		
		
	}
	
	
}
		
	
