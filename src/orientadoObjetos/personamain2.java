package orientadoObjetos;
import java.util.Scanner;
public class personamain2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Persona[]a=new Persona[4];
		int ele;
		String resp="si";
		while (resp != "no") {
		System.out.println("1. Introducir las personas (pedimos los datos de TODAS las personas y los\r\n"
				+ "almacenamos para usos posteriores).\r\n"
				+ "2. Muestra la persona de mayor edad.\r\n"
				+ "3. Muestra la información de una persona tras introducir su DNI.\r\n"
				+ "4. Muestra la información de todas las personas.\r\n"
				+ "5. Salir");
		ele = teclado.nextInt();
		
		switch(ele){
			case 1: 
				rellenar (a, teclado);
				  break;
			  
			case 2: 
				mayoredad (a);
				break;
				
			case 3:
				info (a, teclado);
				break;
			case 4:
				info2 (a);
				break;
			case 5:
				resp = "no";
			
			
		}
				}
				
	}
				
				
		
		
		
	
	
	  public static void rellenar (Persona [] a, Scanner teclado) {
		  for (int i=0; i<=a.length-1;i++) {
				Persona p1=new Persona();
				System.out.println("introduce el DNI");
				p1.setDNI(teclado.next());
				System.out.println("introduce la edad");
				p1.setEdad(teclado.nextInt());
				System.out.println("introduce el nombre");
				p1.setNombre(teclado.next());
				a[i]=p1;
		  }
	  }
	  public static void mayoredad (Persona [] a) {
		  int max=0;
		  for (int i=0; i<=a.length-1;i++) {
			  if (a[i].getEdad()>max) {
				  max = a[i].getEdad();
			  }
		  }
		  System.out.println(max);
		  
	  }
	  
	  public static void info (Persona [] a, Scanner teclado) {
		  String intr;
		  System.out.println("introduce el DNI");
		  intr = teclado.next();
		  for (int i=0; i<=a.length-1; i++) {
			  if (intr.equalsIgnoreCase(a[i].getDNI())) {
				  System.out.println(a[i].getNombre());
				  System.out.println(a[i].getEdad());
				  break;
			  }else if(i==a.length-1) {
				  System.out.println("el DNI introducido no existe");
			  }
		  }
		  
		  
	  }
	  public static void info2 (Persona [] a) {
		  for (int i=0; i<=a.length-1; i++) {
			  System.out.println(a[i].toString());
		  }
		  
		  
	  }
	  
	  }
	  
	  

	
	

