package Profesor_publicaciones;

import java.time.LocalDate;

public class Libro extends Publicacion {
	private String isbn;
	private boolean premiado;
	
	public Libro(LocalDate fechaPubli, String titulo, String isbn, boolean premiado) {
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
