package ejercicos;
import java.util.Scanner;
public class Sacanumw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		int num;
		int contador = 1;
		int contador1 = 1;
		
		
		System.out.println("introduce un numero");
		num = teclado.nextInt();
		
		while (contador<=num) {
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("introduce otro numero");
		num = teclado.nextInt();
		do {
			System.out.println(contador1);
			contador1++;
		}while (contador1<=num);
	}

}
