package ejercicos;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
public class EjercicioStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre;
		int opcion;
		String pal;
		String pal2;
		
		
		System.out.println("buenos dias, cual es su nombre?");
		nombre = teclado.next();
		System.out.println("bienvenido " + nombre + "¿que quieres hacer?");
		System.out.println("1. dar la vuelta a una palabra\r\n"
				+ "2. comparar 2 palabras\r\n"
				+ "3. numero de letras\r\n"
				+ "4. salir\r\n");
		
		opcion = teclado.nextInt();
		
		switch (opcion) {
			case 1: 	System.out.println("introduzca una palabra");
						pal = teclado.next();
						StringBuffer sbr = new StringBuffer(pal);
						sbr.reverse();
				        System.out.println(sbr);
						break;
						
			case 2:		System.out.println("introduzca la primera palabra");
						pal = teclado.next();
						System.out.println("introduzca la segunda palabra");
						pal2 = teclado.next();
						if (pal.equals(pal2)) {
							System.out.println("las palabras son iguales");
						}else {
							System.out.println("las palabras no son iguales");
						}
						break;
						
			case 3:		System.out.println("escribe una palabra");
						pal = teclado.next();
						System.out.println("la palabra tiene " + pal.length() + " letras");
						if (pal.length()>7) {
							System.out.println("la palabra es larga");
						}else {
							System.out.println("la palabra es corta");
						}
						break;
						
			case 4:		System.out.println("agur!");
						break;
						
		
		
		}
		teclado.close();
		
	}

}
