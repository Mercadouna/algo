package orientadoObjetos;

public class Persona {
	private int edad;
	private String DNI;
	private String nombre;
	
	public Persona () {
		this.nombre="";
		this.DNI="";
		this.edad=0;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", DNI=" + DNI + ", nombre=" + nombre + "]";
	}

	public void setEdad(int string) {
		this.edad = string;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
		
	
	public void mostrar() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: "+ this.edad);
		System.out.println("DNI "+ this.DNI);
	}
	
	public boolean esmayordeedad() {
		boolean mayor=false;
		if (this.edad>=18) {
			return mayor=true;
		}else {
			return mayor=false;
		}
		
		
		
	}
	
}
