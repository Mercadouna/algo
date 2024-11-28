package orientadoObjetos;

public class Libro {
	
	private String isbn;
	private String titulo;
	private int ejemplvend;
	private int precio;
	private String autor;
	
	 public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Libro() {
		 this.isbn="";
		 this.titulo="";
		 this.ejemplvend=0;
		 this.precio=0;
		 this.autor="";
	 }
	 public Libro(String i, String t, String a, int p, int e) {
		 this.isbn=i;
		 this.titulo=t;
		 this.ejemplvend=e;
		 this.precio=p;
		 this.autor=a;
	 }
	 

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getEjemplvend() {
		return ejemplvend;
	}

	public void setEjemplvend(int ejemplvend) {
		this.ejemplvend = ejemplvend;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", ejemplvend=" + ejemplvend + ", precio=" + precio
				+ ", autor=" + autor + "]";
	}
	 
	 
	
}
