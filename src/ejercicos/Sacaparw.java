package ejercicos;
import java.util.Scanner;
public class Sacaparw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num;
		int contador = 0;
		
		System.out.println("introduce un numero");
		num = teclado.nextInt();
		
		while (contador<=num) {
			if (contador%2==0) {
				
				System.out.println(contador);
			}
			contador++;
		}
		
		
	}

}
