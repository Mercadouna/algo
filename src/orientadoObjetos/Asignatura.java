package orientadoObjetos;

public class Asignatura {
	private String nom;
	private String curso;
	private int numal;
	private int numsusp;
	private String autor;

		 public Asignatura() {
			 this.nom="";
			 this.curso="";
			 this.numal=0;
			 this.numsusp=0;
			 this.autor="";
		 }
		 
			 
		 
		 

		@Override
		public String toString() {
			return "Asignatura [nom=" + nom + ", curso=" + curso + ", numal=" + numal + ", numsusp=" + numsusp + "]";
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}

		public int getNumal() {
			return numal;
		}

		public void setNumal(int numal) {
			this.numal = numal;
		}

		public int getNumsusp() {
			return numsusp;
		}

		public void setNumsusp(int numsusp) {
			this.numsusp = numsusp;
		}
}