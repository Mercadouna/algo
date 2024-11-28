package ejercicos;
import java.util.Scanner;
public class Mayormenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("introduzca el primer numero");
		num1 = teclado.nextDouble();
		System.out.println("introduzca el segundo numero");
		num2 = teclado.nextDouble();
		if (num1>num2) {
			System.out.println("el primer numero introducido es el mayor");
		} if (num1 < num2) {
			System.out.println("el segundo numero introducido 2 es el mayor");
			System.out.println("los dos numeros son iguales");
		}else {
			System.out.println("los dos numeros son iguales");
		}
		teclado.close();
		
		
		
	}

}
