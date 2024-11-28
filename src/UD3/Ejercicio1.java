package UD3;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		int ele,suma=0;
		
		int [] a = new int [10];
		for (int i=0; i<a.length; i++) {
			a[i] = random.nextInt(100);
		}
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("1. Salir\r\n"
				+ "2. Mostrar la suma\r\n"
				+ "3. Mostrar el máximo\r\n"
				+ "4. Mostrar el mínimo\r\n"
				+ "5. Mostrar la media\r\n"
				+ "6. Rellenarlo de nuevo con números (formatear)");
		ele = teclado.nextInt();
		switch (ele) {
			case 1: 
				System.out.println("Adios!");
				break;
			case 2: 
				for (int i=0; i<a.length; i++) {
					suma = suma + a[i];
				}
				System.out.println("la suma es: " + suma);
				break;
			case 3: 
				for (int i=0; i<a.length; i++) {
					if (a[i]>suma) {
						suma = a[i];
						}
					}
					System.out.println("el maximo es: " + suma);
				break;
			case 4: 
				suma = a[0];
				for (int i=0; i<a.length; i++) {
					if (a[i]<suma) {
						suma = a[i];
						}
					}
					System.out.println("el minimo es: " + suma);
				break;
			case 5: 
				for (int i=0; i<a.length; i++) {
					suma = suma + a[i];
				}
				suma = suma/a.length;
				System.out.println("la media es: " + suma);
				break;
			case 6: 
				for (int i=0; i<a.length; i++) {
					a[i] = random.nextInt(100);
				}
				for (int i=0; i<a.length; i++) {
					System.out.println(a[i]);
				}
				break;
		}
			
			
	}

}
