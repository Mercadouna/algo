package UD3;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int [] a = new int [10];
		int num=0,num2=0,num3=0;
		
		while (num >=0 && num2!=a.length) {
			System.out.println("introduce un numero");
			num = teclado.nextInt();
			if (num>0) {
				a[num2] = num;
				num2++;
			}
		}
		for (int i=0; i<num2; i++) {
			num3 = num3+a[i];
		}
		System.out.println("la media es: " + (num3/num2));
		teclado.close();
	}

}
