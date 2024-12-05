package Profesor_publicaciones;

import java.time.LocalDate;

public class Publicacion {
	protected LocalDate fechaPubli;
	protected String titulo;
	
	public Publicacion (LocalDate fechaPubli, String titulo) {
		this.fechaPubli = fechaPubli;
		this.titulo = titulo;
	}
	public LocalDate getFechaPubli() {
		return fechaPubli;
	}
	public void setFechaPubli(LocalDate fechaPubli) {
		this.fechaPubli = fechaPubli;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "Publicacion [fechaPubli=" + fechaPubli + ", titulo=" + titulo + "]";
	}
	
	

}
