package profesorUni;

import java.util.ArrayList;

public class Profesor {
	
	private String email;
	private String nombre;
	private String dep;
	private ArrayList <Publicacion> a = new ArrayList <Publicacion>();
	
	
	public Profesor(String email, String nombre, String dep, ArrayList<Publicacion> a) {
		this.email = email;
		this.nombre = nombre;
		this.dep = dep;
		this.a = a;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public ArrayList<Publicacion> getA() {
		return a;
	}
	public void setA(ArrayList<Publicacion> a) {
		this.a = a;
	}
	
	@Override
	public String toString() {
		return "Profesor [email=" + email + ", nombre=" + nombre + ", dep=" + dep + ", a=" + a + "]";
	}
	
	

}
