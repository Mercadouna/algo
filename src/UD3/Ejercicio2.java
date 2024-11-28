package UD3;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int ele,num;
		String [] a = {"alain","jon","andoni","igor","ander"};
		String nom;
		int sum=0;
		boolean encontrado=false;
		System.out.println("1. Salir\r\n"
				+ "2. Mostrar lista\r\n"
				+ "3. Pedir un nombre y contar las veces que aparece\r\n"
				+ "4. Pedir un nombre y decir si existe\r\n"
				+ "5. Eliminar. Pedir un nombre y en el lugar de ese nombre introducir “null”.");
		ele = teclado.nextInt();
		switch (ele) {
		case 1: 
			System.out.println("adios!");
			break;
		case 2:
			for (int i=0; i<a.length; i++) {
				System.out.println(a[i]);
			}
			break;
		case 3:
			System.out.println("introduce un nombre");
			nom = teclado.next();
			for (int i=0; i<a.length; i++) {
				if(nom.equalsIgnoreCase(a[i])) {
					sum++;
				}
			}
			System.out.println("aparece " + sum + " veces");
			break;
		case 4:
			System.out.println("introduce un nombre");
			nom = teclado.next();
			for (int i=0; i<a.length && !encontrado; i++) {
				if (nom.equals(a[i])) {
					encontrado = true;
				}
			}
			if (encontrado) {
				System.out.println("encontrado");
			}else {
				System.out.println("NO encontrado");
			}
			break;
		case 5:
			System.out.println("introduce un nombre");
			nom = teclado.next();
			for (int i=0; i<a.length && !encontrado; i++) {
				if(nom.equalsIgnoreCase(a[i])) {
					encontrado = true;
					a[i]=null;
					}
				}
			if (encontrado) {
				System.out.println("borrado");
			}else {
				System.out.println("NO borrado");
			}
			break;
		}
		
		
	}

}
