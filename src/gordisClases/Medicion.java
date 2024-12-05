package gordisClases;

import java.time.LocalDate;

public class Medicion {

	private LocalDate fecha;
	private double peso;
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Medicion(LocalDate fecha, double peso) {
		super();
		this.fecha = fecha;
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Medicion [fecha=" + fecha + ", peso=" + peso + "]";
	}
	
	
	
}
