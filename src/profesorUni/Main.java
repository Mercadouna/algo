package profesorUni;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
	
	
	
	public static int mostrarMenu(Scanner teclado) {
		System.out.println("1. Introducir un nuevo profesor.");
		System.out.println("2. Añadir publicación");
		System.out.println("3. Mostrar los libros galardonados de un año concreto.");
		System.out.println("4. Listado de los profes");
		System.out.println("5. Salir");
		return teclado.nextInt();
	}

	static boolean isValidEmail(String email) {
		String EMAIL_REGEX = "^[a-zA-Z0-9_+.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
	
	public static void introducir(ArrayList <Profesor> a, Scanner teclado) {
		
		int pos;
		
		//ATRIBUTOS PROFESOR
		String email;
		String nombre;
		String dep;
		ArrayList <Publicacion> publi;

		//ATRIBUTOS PUBLICACIONES
		LocalDate fechaPubli;
		String titulo;

		//ATRIBUTOS LIBRO
		String isbn;
		char premiado;
		//ATRIBUTOS ARTICULO
		String medio;
		
		
		System.out.println("introduce el email: ");
		nombre = teclado.next();
		

	

	}

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		int op=-1;
		ArrayList <Profesor> a = new ArrayList<Profesor> ();

		do {
			switch(op=mostrarMenu(teclado)) {
			case 1:
				introducir(a, teclado);
				break;
			case 2:
				
					
				break;
			case 3:
				
					
				break;
			case 4:
				
					
				break;
			case 5:
				break;
			case 6:
				
				break;
			
			default:
				System.out.println("Esa op no esta");

			}
		}while(op!=5);

		teclado.close();
	}
}
