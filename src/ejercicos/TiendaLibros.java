package ejercicos;
import java.util.Scanner;
public class TiendaLibros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int edad, opc,salir = 2;
		String nombre,apellido,DNI;
		double precio,precio1;
		String noml;
		
		
		System.out.println("introduzca su nombre");
		nombre = teclado.next();
		System.out.println("introduzca su apellido");
		apellido = teclado.next();
		System.out.println("introduzca su DNI");
		DNI = teclado.next();
		System.out.println("introduzca su edad");
		edad = teclado.nextInt();
		if (edad<18) {
			System.out.println("Debes tener mas de 18 años");
		}else {
			do  {
				System.out.println("escoja una opcion");
				System.out.println("1.- Comprar libro\r\n"
						+ "2.- Comprobar si hay stock\r\n"
						+ "3.- Salir del programa\r\n");
				
				opc = teclado.nextInt();
				switch (opc) {
				
					case 1: 
						System.out.println("inserte el primer precio");
						precio = teclado.nextDouble();
						while (precio<0) {
							System.out.println("el precio no puede ser negativo");
							System.out.println("inserte el primer precio");
							precio = teclado.nextDouble();
						}
						System.out.println("inserte el segundo precio");
						precio1 = teclado.nextDouble();
						while (precio1<0) {
							System.out.println("el precio no puede ser negativo");
							System.out.println("inserte el segundo precio");
							precio1 = teclado.nextDouble();
						}
						System.out.println("Total: " + (precio+precio1) + " Euros");
						break;
						
					case 2:
						System.out.println("introduce el nombre del libro");
						noml = teclado.next();
						
						if ("tiburon".equals(noml)) {
							System.out.println("Ese libro está disponible");
						}else {
							System.out.println("Ese libro no está disponible");
						}
						break;
					case 3:
						System.out.println("hasta pronto!");
						break;
				}
				System.out.println("¿Quieres salir del programa? 1.SI / 2.NO");
				salir = teclado.nextInt();
				
			}while (salir == 2);
			
			
		
			
			
		}
		
		
	}

}
