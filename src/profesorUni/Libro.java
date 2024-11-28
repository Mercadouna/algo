package profesorUni;

import java.time.LocalDate;

public class Libro extends Publicacion {
	private String isbn;
	private boolean premiado;
	
	
	public Libro(String isbn, boolean premiado, LocalDate fechaPubli, String titulo) {
		super(fechaPubli, titulo);
		this.isbn = isbn;
		this.premiado = premiado;
	}
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean getPremiado() {
		return premiado;
	}
	public void setPremiado(boolean premiado) {
		this.premiado = premiado;
	}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", premiado=" + premiado + ", toString()=" + super.toString() + "]";
	}

	

}
