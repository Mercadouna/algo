package repasoExamen;

public class Asignatura {
	
	private String nombre;
	private String curso;
	private int matriculados;
	private int suspensos;
	
	public Asignatura(String n, String c, int m, int s) {
		this.nombre=n;
		this.curso=c;
		this.matriculados=m;
		this.suspensos=s;
	}
	
	public Asignatura(String n, String c) {
		this.nombre=n;
		this.curso=c;
		this.matriculados=0;
		this.suspensos=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getMatriculados() {
		return matriculados;
	}

	public void setMatriculados(int matriculados) {
		this.matriculados = matriculados;
	}

	public int getSuspensos() {
		return suspensos;
	}

	public void setSuspensos(int suspensos) {
		this.suspensos = suspensos;
	}

	@Override
	public String toString() {
		return "Asignaturas [nombre=" + nombre + ", curso=" + curso + ", matriculados=" + matriculados + ", suspensos="
				+ suspensos + "]";
	}
	
	public double porcentajeAprobados() {
		return (obtenerNumeroAprobados()*100)/this.matriculados;
	}

	public int obtenerNumeroAprobados() {
		return this.matriculados-this.suspensos;
	}
	

}
