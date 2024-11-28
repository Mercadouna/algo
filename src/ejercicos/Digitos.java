package ejercicos;
import java.util.Scanner;
public class Digitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num;
		
		 System.out.print("Introduce un número entero: ");
	     num = scanner.nextInt();

	        
	     String numeroComoString = String.valueOf(num);

	    
	        
	     System.out.println("El número de dígitos es: " + numeroComoString.length());

	     scanner.close();
		
		
	}

}
