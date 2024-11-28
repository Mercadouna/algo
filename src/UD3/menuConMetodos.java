package UD3;
import java.util.Scanner;
public class menuConMetodos {
	static Scanner teclado = new Scanner(System.in);
	static int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ele;
		ele = teclado.nextInt();
		switch (ele) {
			case 1:
				mostrar ();
				break;
			case 2:
				intrnum ();
				break;
				
		}
	}

	
	
	
	public static void mostrar () {
		int [] a = {30, 60, 100, 150, 200, 210, 220, 225, 230, 240};
		int [] b = new int [10];
		for (int j=0; j<a.length; j++) {
			b [j] = a[j]*2;
		}
		String nom;
		System.out.println("introduzca su nombre:");
		nom = teclado.next();
		System.out.println(nom.toUpperCase());
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i] + "  " + b[i]);
		}
	}
	public static void intrnum () {
		int cont=0, cont2=0;
		String resp = "si";
		while (resp.equalsIgnoreCase("si")) {
			System.out.println("introduzca un numero");
			num = teclado.nextInt();
			if (num>-1) {
				cont = cont + num;
				cont2++;
				for (int i=0; i<num; i++) {
					System.out.print("*");
			}
			}else {
				System.out.print("?");
			}
			System.out.println("");
			System.out.println("quieres seguir utilizando el programa? si/no");
			resp=teclado.next();
					
		}
		System.out.println("su media es de " + (cont/cont2));
		System.out.println("has introducido " + cont2 + " numeros positivos");
	}
	public static void tantosnumeros () {
		int [] b = new int [10];
		for (int i; i==10; i++) {
			System.out.println("introduce el numero " + i);
			b[i] = teclado.nextInt();
		}
	}
}
