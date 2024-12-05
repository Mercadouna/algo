package ejercicos;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Asd {

	


		 public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Introduce un año: ");
		        int anio = scanner.nextInt();

		        // Extraemos los dos últimos dígitos
		        int dosUlt = anio % 100;

		        System.out.println("Los dos últimos dígitos del año son: " + dosUlt);
		        
		        
		        String a1="ab" + Integer.toString(dosUlt);
		        System.out.println(a1);
		    }
		
		
	
		}


