package gordisClases;
import java.util.ArrayList;
import utilidades.Utilidades;
import java.time.LocalDate;
public class Gordis extends Persona{
		private String codGord;
		private double altura;
		private ArrayList <Medicion> a;
		
		
	
	public Gordis(String nom, String ape, LocalDate fechan) {
		super(nom, ape, fechan);
		this.codGord=nom.substring(2) + fechan.getYear() % 100;
		this.altura=0;
		this.a = new ArrayList <Medicion> ();
		
	}



	public String getCodGord() {
		return codGord;
	}



	public void setCodGord(String codGord) {
		this.codGord = codGord;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public ArrayList<Medicion> getA() {
		return a;
	}



	public void setA(ArrayList<Medicion> a) {
		this.a = a;
	}



	@Override
	public String toString() {
		return "Gordis [codGord=" + codGord + ", altura=" + altura + ", a=" + a + ", toString()=" + super.toString()
				+ "]";
	}




}
