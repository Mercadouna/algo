package ejercicos;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Asd {

	

			public static void main(String[] args) {
			
		ArrayList <String> a = new ArrayList();
				Scanner teclado = new Scanner(System.in);
				int opcion=0;
				String cadena;
				
				System.out.println("1- Añadir");
				System.out.println("2- Buscar");
				System.out.println("3- Borrar");
				System.out.println("4- Listar");
				System.out.println("5- Salir");
				System.out.println("¿Qué quieres hacer?");
				opcion=teclado.nextInt();
				do {
					switch (opcion) {
					case 1:
						System.out.println("Introduce el String: ");
						cadena=teclado.next();
						a.add(cadena);
						break;
					case 2:
						System.out.println("Introduce el String a buscar: ");
						cadena=teclado.next();
						if (a.contains(cadena)) {
							System.out.println("Esta en el array ");
						}else {
							System.out.println("NO esta en el array ");
						}
						break;
					case 3:
						System.out.println("Introduce el String a borrar: ");
						cadena=teclado.next();
						a.remove(cadena);
						break;
					case 4:
						for (int i=0;i<a.size();i++) {
							System.out.println(a.get(i));
						}
						
						for (String var:a) {
							System.out.println(var);
						}
						
						// Opción 3: iterator
						Iterator<String> i = a.iterator();
						while (i.hasNext()) {
						 System.out.println(i.next());
						}
						// Opción 4: listIterator
						ListIterator<String> li = a.listIterator();
						while (li.hasNext()) {
						 System.out.println(li.next());
						}
						break;
					case 5: 
						System.out.println("Agur");
						break;
					default:
						System.out.println("ERROR");
					}	
				}while(opcion!=10);
				
			}

		}
