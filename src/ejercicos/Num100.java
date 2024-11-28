package ejercicos;
import java.util.Scanner;
public class Num100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int contador = 1;
		int contador1 = 1;
		
		while (contador<=100) {
			System.out.println(contador);
			contador++;
		}
		
		do {
			System.out.println(contador1);
			contador1++;
		}while (contador1<=100);
	}

}
