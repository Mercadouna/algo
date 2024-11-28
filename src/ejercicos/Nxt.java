package ejercicos;
import java.util.Scanner;
public class Nxt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double num;
		
		System.out.println("introduce un numero");
		num = teclado.nextDouble();
		if(num*num>=100) {
			System.out.println(num*num - 100);
		}else {
			System.out.println(100 - num*num);
		}
		teclado.close();
		
		
		
	}

}
