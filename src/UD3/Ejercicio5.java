package UD3;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int [] a = new int [10];
		int num=0;
		
		while(num>=0) {
			System.out.println("introduce un numero entre el 0 y el 9");
			num = teclado.nextInt();
		
		while (num>=10) {
			System.out.println("ERROR");
			System.out.println("introduce un numero entre el 0 y el 9");
			num = teclado.nextInt();
		}
		if (num>=0) {
			a[num] = a[num]+1;
			}
		}
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]+" ");
		}
		
		
		
		
	}

}
