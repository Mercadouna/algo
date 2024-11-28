package ejercicos;
import java.util.Scanner;
public class Sumapadf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num;
		int contador = 0;
		
		System.out.println("introduce un numero");
		num = teclado.nextInt();
		
		contador = num;
		while (contador>=0) {
			if (contador%2==0) {
				System.out.print(contador + " + " + num + " = " + (contador + num));
				
			}
			contador--;
				
				
			}
			
		}
		
	}

