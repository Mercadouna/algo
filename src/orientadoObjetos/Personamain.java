package orientadoObjetos;

public class Personamain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona();
		p1.setDNI("123456");
		Persona p2=new Persona();
		p2.setEdad(20);
		Persona p3=new Persona();
		p3.setNombre("alain");
		
		if (p1.esmayordeedad()) {
			System.out.println("eres mayor de edad");
		}else {
			System.out.println("no eres mayor de edad");
		}
		
		
		
	}

}
