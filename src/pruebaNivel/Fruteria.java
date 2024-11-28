package pruebaNivel;
import java.util.Scanner;
public class Fruteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nom,ape,frut,contr,frut2;
		int edad,opcion;
		double prec1,prec2,prec3;
		
		
		System.out.println("Introduzca su nombre");
		nom = teclado.next();
		System.out.println("Introduzca su apellido");
		ape = teclado.next();
		System.out.println("Introduzca su edad");
		edad = teclado.nextInt();
		if (edad<18) {
			System.out.println("no puedes acceder en el sistema");
		}else {
			System.out.println("Bienvenido " + nom + " " + ape + " a la fruteria");
			System.out.println("1- Realizar una nueva compra\r\n"
					+ "2- Comprobar si existe fruta\r\n"
					+ "3- Introducir fruta\r\n"
					+ "4- Salir\r\n"
					+ "¿Qué quieres hacer?");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 1: 
				System.out.println("introduce el primer precio");
				prec1 = teclado.nextDouble();
				while (prec1<0) {
					System.out.println("ERROR, introducelo de nuevo");
					prec1 = teclado.nextDouble();
				}
				System.out.println("introduce el segundo precio");
				prec2 = teclado.nextDouble();
				while (prec2<0) {
					System.out.println("ERROR, introducelo de nuevo");
					prec2 = teclado.nextDouble();
				}
				System.out.println("introduce el primer precio");
				prec3 = teclado.nextDouble();
				while (prec3<0) {
					System.out.println("ERROR, introducelo de nuevo");
					prec3 = teclado.nextDouble();
				}
				System.out.println("Total: " + (prec1 + prec2 + prec3) + " Euro");
			break;
			case 2:
				System.out.println("introduzca el nombre de una fruta");
				frut = teclado.next();
				if (frut.equalsIgnoreCase("manzana")) {
					System.out.println("Si tenemos esa fruta");
				}else {
					System.out.println("No tenemos esa fruta");
				}
				break;
			case 3:
				System.out.println("Para realizar esta accion necesitas ser administrador. Introoduce la contraseña:");
				contr = teclado.next();
				while (!contr.equals("abc")) {
					System.out.println("Para realizar esta accion necesitas ser administrador. Introoduce la contraseña:");
					contr = teclado.next();
				}
					System.out.println("eres administrador");
					System.out.println("introduce el nombre de la fruta");
					frut2 = teclado.next();
					System.out.println("la fruta " + frut2 + " se ha guardado");
					System.out.println("la fruta " + frut2 + " se ha guardado");
					System.out.println("la fruta " + frut2 + " se ha guardado");
			case 4:
				System.out.println("Hasta luego " + nom);
					
				
					
				
			}
			
			
			
			
			
		}
		
		
		
		
		
	}

}
