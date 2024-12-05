package gordisClases;
import java.time.LocalDate;
public class Persona {
	
	protected String nom;
	protected String ape;
	protected LocalDate fechan;
	
	
	public Persona (String nom, String ape, LocalDate fechan) {
		this.nom="";
		this.ape="";
		this.fechan=fechan;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getApe() {
		return ape;
	}


	public void setApe(String ape) {
		this.ape = ape;
	}


	public LocalDate getFechan() {
		return fechan;
	}


	public void setFechan(LocalDate fechan) {
		this.fechan = fechan;
	}


	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", ape=" + ape + ", fechan=" + fechan + "]";
	}
	
	
	
}
