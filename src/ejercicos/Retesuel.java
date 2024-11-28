package ejercicos;
import java.util.Scanner;
public class Retesuel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double sueldo;
		
		
		System.out.println("introduzca su sueldo");
		sueldo = teclado.nextDouble();
		if(sueldo<1000) {
			System.out.println("la retencionn es de un 10%");
		}
		else if (sueldo>1000) {
				System.out.println("la retencionn es de un 14%");
		}
			else {
			
				System.out.println("la retencionn es de un 12%");
			}
		teclado.close();
			}
				
		
	}


