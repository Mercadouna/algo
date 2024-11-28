package UD3;
import java.util.Scanner;
public class TiendaDeLibros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String[]a=new String[20];
		int[]b=new int[20];
		int opcion, i=0, precio=0, precioNuevo=0;
		String libro, nuevo, libroNuevo, respuesta="";
		boolean existe=false;

		a[0]="Nada";
		a[1]="Tímidamente de la oscuridad a la luz";
		a[2]="Pájaros a golpes";
		a[3]="Caperuzita Roja";
		a[4]="12 cuentos clasicos";
		a[5]="Pepe y Mila";
		a[6]="Enojaos";
		a[7]="En casa vacía";
		a[8]="123";
		a[9]="Día Negro";
		a[10]="El Hobbit";
		a[11]="Calle Judía";

		b[0]=15;
		b[1]=12;
		b[2]=15;
		b[3]=25;
		b[4]=19;
		b[5]=17;
		b[6]=25;
		b[7]=13;
		b[8]=11;
		b[9]=18;
		b[10]=25;
		b[11]=35;

		System.out.println("Bienvenido/a");
		do {
			existe=false;
			i=0;
			System.out.println("1. Mostrar el título de todos los libros\n2. Mostrar el título y el precio de todos los libros\n3. Mostrar el precio de un libro\n4. Introducir un nuevo libro\n5. Eliminar un libro\n6. Modificar el título de un libro\n7. Modificar el titulo de un libro.\n8. Salir del programa");
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
				for(i=0;i<a.length && a[i]!= null;i++) {
					System.out.println(a[i]);
				}
				break;
			case 2:
				for(i=0;i<a.length && a[i]!= null;i++) {
					System.out.println(a[i]+" "+b[i]+" €");
				}
				break;
			case 3:
				System.out.println("Introduzca el nombre del libro");
				teclado.nextLine();
				libro=teclado.nextLine();
				do {
					if(libro.equalsIgnoreCase(a[i])&&i<a.length) {
						System.out.println("El libro "+libro+" tiene un precio de"+b[i]+"€\n");
						existe=true;
					}
						i++;
					
				}while(!existe&&i<a.length);
				if (!existe) {
					System.out.println("No existe");
				}
				break;
			case 4:
				do {
					if(a[i] == null) {
						existe=true;
						System.out.println("¿Cual es el titulo del libro?");
						teclado.nextLine();
						nuevo=teclado.nextLine();
						System.out.println("¿Cual es el precio del libro?");
						precio=teclado.nextInt();
						a[i] = nuevo;
						b[i] = precio;
						System.out.println("El libro se a guardado correctamente.");
					}else {
						i++;
					}
				}while(!existe && i < a.length);
				if (!existe) { // i=a.length-1
					System.out.println("Tienes muchos libros en la tienda, elimina un libro.");
				}
				
							
				break;
			case 5:
				System.out.println("¿Cual es el titulo del libro?");
				teclado.nextLine();
				libro=teclado.nextLine();
				
				for (i = 0; !existe && i < a.length; i++) {
					if (libro.equalsIgnoreCase(a[i])) {
						existe = true;
						a[i] = null;
						b[i] = 0;
						System.out.println(libro + " - Ha sido eliminado");
						for (int j = i + 1; j < a.length; j++) {
							a[j - 1] = a[j];
							b[j - 1] = b[j];
						}
					}
				}
				a[a.length-1]=null;
				b[a.length-1]=0;
				
				if (!existe) { // i=a.length-1
					System.out.println("El libro no existe");
				}
				break;
			case 6:
				System.out.println("¿Cual es el titulo del libro?");
				teclado.nextLine();
				libro=teclado.nextLine();
				for(i=0; i<a.length && !existe; i++) {
					if (a[i].equalsIgnoreCase(libro)) {
						existe=true;
						System.out.println("El libro "+libro+" tiene un precio de "+b[i]+"€");
						System.out.println("¿Cual es el nuevo precio?");
						precioNuevo=teclado.nextInt();
						b[i]=precioNuevo;
						System.out.println("El nuevo precio de "+libro+" es de "+precioNuevo+"€\n");
					}
				}
				if (!existe) { // i=a.length-1
					System.out.println("El libro no existe");
				}
				break;
			case 7:
				System.out.println("¿Cual es el titulo del libro?");
				teclado.nextLine();
				libro=teclado.nextLine();
				
				for(i=0; i<a.length && !existe; i++) {
					if (a[i].equalsIgnoreCase(libro)) {
						existe=true;
						System.out.println("¿Cual quieres que sea el nuevo titulo del libro?");
						libroNuevo=teclado.nextLine();
						a[i]=libroNuevo;
						System.out.println("El titulo a sido modificado correctamente.");
						System.out.println("El nuevo titulo de "+libro+" es "+libroNuevo);
					}
				}
				if (!existe) { // i=a.length-1
					System.out.println("El libro no existe");
				}
				break;
			case 8:
				System.out.println("Agur");
				break;
			default:
				System.out.println("Introduzca una opcion valida");
			}
			
			if (opcion!=8) {
				System.out.println("¿Quieres continuar del programa? SI/NO");
				respuesta = teclado.next();
					
				while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
					System.out.println("Las opciones válidas son Si o No");
					System.out.println("¿Quieres continuar del programa? SI/NO");
					respuesta = teclado.next();
				}
				
			}
		}while(opcion!=8 && respuesta.equalsIgnoreCase("si"));
		System.out.println("Hasta pronto");
	}

}