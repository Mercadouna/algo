package ejercicos;
import java.util.Scanner;
public class Calculatva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double dinero;
		
		System.out.println("introduce la cantidad en euros");
		dinero = teclado.nextDouble();
		if (dinero>=20000) {
			System.out.println("el IVA es del 16%");	
		}else {
			System.out.println("el IVA es del 7%");
		}
		
		teclado.close();
		
		
	}

}
