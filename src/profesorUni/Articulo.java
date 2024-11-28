package profesorUni;

import java.time.LocalDate;

public class Articulo extends Publicacion{
	private String medio;

	
	public Articulo(String medio, LocalDate fechaPubli, String titulo) {
		super(fechaPubli, titulo);
		this.medio = medio;
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}

	@Override
	public String toString() {
		return "Articulo [medio=" + medio + ", toString()=" + super.toString() + "]";
	}
	
}
