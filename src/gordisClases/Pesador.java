package gordisClases;
import java.time.LocalDate;
public class Pesador extends Persona{

	private String fechaAlta;
	
	public Pesador(String nom, String ape, LocalDate fechan, String fechaAlta) {
		super(nom, ape, fechan);
		this.fechaAlta="";
	}
	
	
	
}
