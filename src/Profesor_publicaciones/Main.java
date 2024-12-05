package Profesor_publicaciones;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int mostrarMenu(Scanner teclado) {
		System.out.println("1. Introducir un nuevo profesor.");
		System.out.println("2. Añadir publicación");
		System.out.println("3. Mostrar los libros galardonados de un año concreto.");
		System.out.println("4. Listado de los profes");
		System.out.println("5. Salir");
		return teclado.nextInt();
	}

	public static void mostrarProfesores(ArrayList <Profesor> a) {
		for(int i=0; i<a.size();i++) {
			System.out.println(a.get(i).getNombre());	
		}
	}

	public static void mostrarLibrosGalardo (ArrayList <Profesor> a, Scanner teclado) {
		LocalDate anio;
		LocalDate anioAux;
		ArrayList <Publicacion> bAux = new ArrayList<Publicacion> ();
		System.out.println("Introduzca la fecha de la que quiera ver los libros galardonados:");
		String fechaString = teclado.next();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaPubli = LocalDate.parse(fechaString, formateador);
		for(int i =0; i<a.size();i++) {
			bAux.removeAll(bAux);
			bAux.addAll(a.get(i).getA());
			for(int j =0; i<bAux.size();j++)
			{
				anioAux=((((Libro)(bAux.get(j))).getFechaPubli()));
				if(anioAux.compareTo(fechaPubli)==0) {
					if((((Libro)bAux.get(j)).getPremiado())) {
						System.out.println(bAux.get(j).toString());
					}

				}
			}
		}
	}


	public static boolean emailCorrectoCaracteres(String email) {
		String nomUser ="";
		int ultimoChar = 0;
		for (int i=0; !nomUser.equals("@")|| email.length()== i;i++) {
			if((nomUser.charAt(i))!= ' ' && (nomUser.charAt(i))!= '-' ) {
				nomUser= nomUser+email.charAt(i);
				ultimoChar=i;
			}
			else {
				return false;
			}
		}
		for(int i = ultimoChar; email.length()!=i;i++) {
			if((nomUser.charAt(i)!= '1'&& nomUser.charAt(i)!= '2'&& nomUser.charAt(i)!= '3'&& nomUser.charAt(i)!= '4'&& nomUser.charAt(i)!= '5'&& nomUser.charAt(i)!= '6'&& nomUser.charAt(i)!= '7'&& nomUser.charAt(i)!= '8'&& nomUser.charAt(i)!= '9'&& nomUser.charAt(i)!= '0')) {
				nomUser = nomUser+email.charAt(i);
			}
			else {
				return false;
			}
		}

		return true;
	}

	public static int buscarPorEmail(ArrayList <Profesor> a, String email) {
		for(int i =0; i<a.size();i++) {
			if(a.get(i).getEmail().equalsIgnoreCase(email)) {
				return i;
			}
		}
		return -1;
	}

	public static boolean buscarPorTitulo(ArrayList <Profesor> a, String titulo) {
		ArrayList <Publicacion> b = new ArrayList<Publicacion> ();
		for(int h=0; h<a.size();h++) {
			b.addAll(a.get(h).getA());
		}
		for(int i =0; i<a.size();i++) {
			for(int j =0; i<b.size();j++)
			{
				if(b.get(j).getTitulo().equals(titulo)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void introducirPublicacion (ArrayList <Profesor> a, Scanner teclado) {
		String email = null;
		boolean encontrado= false;
		int numPublicaciones =0;
		int op;
		//ATRIBUTO COMUNES
		String fechaString;
		LocalDate fechaPubli;
		ArrayList <Publicacion> b = new ArrayList<Publicacion> ();

		//ATRIBUTO LIBRO
		String isbn;
		boolean premiado;
		String titulo;

		//ATRIBUTO ARTICULO
		String medio;

		//ATRIBUTO POS DEL PROFESOR EN EL ARRAYLIST
		int pos;


		System.out.println("Cuantas publicaciones quiere añadir:");
		numPublicaciones = teclado.nextInt();

		System.out.println("Cual es el email del profesor al que se lo quiere aniadir:");
		email = teclado.next();
		pos=buscarPorEmail(a, email);

		if(pos!=-1) {

			for(int i=numPublicaciones;i>0;i--) {
				System.out.println("Fecha de publicacion:");
				fechaString= teclado.next();
				DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				fechaPubli = LocalDate.parse(fechaString, formateador);
				do {
					System.out.println("Aniada el nuevo titulo, ten en cuenta que no se pueden repetir:");
					titulo= teclado.next();
				} while(buscarPorTitulo(a, titulo)== false);
				System.out.println("Es un libro (1) o un articulo(2):");
				op= teclado.nextInt();
				switch (op) {
				case 1:
					System.out.println("ISBN:");
					isbn= teclado.next();
					System.out.println("Esta premiado (S/N):");
					if(teclado.next().toUpperCase().charAt(0)=='S') {
						premiado= true;
					}else {
						premiado= false;
					}
					b.addAll(a.get(pos).getA());
					b.add(new Libro(fechaPubli,titulo, isbn, premiado));
					break;
				case 2:
					System.out.println("Medio de publicacion:");
					medio = teclado.next();
					b.addAll(a.get(pos).getA());
					b.add(new Articulo(fechaPubli,titulo, medio));
					break;
				default :
					System.out.println("Esa opcion no existe.");
				}
			}
		}
	}


	public static void introducir(ArrayList <Profesor> a, Scanner teclado) {

		int pos;
		CharSequence fechaString = null;
		int numPublicaciones;//para lluego iguaalar al i y saber hasta cuando recorrer el ArrayList
		int op = 0;
		ArrayList <Publicacion> b = new ArrayList<Publicacion> ();

		//ATRIBUTOS PROFESOR
		String email = null;
		String nombre;
		String dep;
		ArrayList <Publicacion> publi;

		//ATRIBUTOS PUBLICACIONES
		LocalDate fechaPubli;
		String titulo;

		//ATRIBUTOS LIBRO
		String isbn;
		boolean premiado;
		//ATRIBUTOS ARTICULO
		String medio;
		do {
			do {
				System.out.println("Introduzca el Email, no puede contener espacios o '-' en el nombre de usuario, si el correo ya existe se le volvera a pedir que lo introduzca:");
				email= teclado.next();
			}while(emailCorrectoCaracteres(email)==true);
		}while(buscarPorEmail(a, email)!=-1);

		System.out.println("Nombre:");
		nombre= teclado.next();
		System.out.println("Departamento:");
		dep= teclado.next();
		System.out.println("Numero de publicaciones introduzca -1 si no quiere aniadir ninguna:");
		numPublicaciones = teclado.nextInt();
		for(int i=numPublicaciones;i>0;i--) {
			System.out.println("Fecha de publicacion:");
			fechaString= teclado.next();
			DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			fechaPubli = LocalDate.parse(fechaString, formateador);
			do {
				System.out.println("Aniada el nuevo titulo, ten en cuenta que no se pueden repetir:");
				titulo= teclado.next();
			} while(buscarPorTitulo(a, titulo)== false);
			System.out.println("Es un libro (1) o un articulo(2):");
			op= teclado.nextInt();
			switch (op) {
			case 1:
				System.out.println("ISBN:");
				isbn= teclado.next();
				System.out.println("Esta premiado (S/N):");
				if(teclado.next().toUpperCase().charAt(0)=='S') {
					premiado= true;
				}else {
					premiado= false;
				}
				b.add(new Libro(fechaPubli,titulo, isbn, premiado));
				break;
			case 2:
				System.out.println("Medio de publicacion:");
				medio = teclado.next();
				b.add(new Articulo(fechaPubli,titulo, medio));
				break;
			default :
				System.out.println("Esa opcion no existe.");
			}

		}
		a.add(new Profesor (email,nombre,dep,b));
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
				if(!a.isEmpty()) {
					introducirPublicacion(a, teclado);
				}else {
					System.out.println("Debe introducir primero.");
				}
				break;
			case 3:
				if(!a.isEmpty()) {
					mostrarLibrosGalardo(a, teclado);
				}else {
					System.out.println("Debe introducir primero.");
				}

				break;
			case 4:
				if(!a.isEmpty()) {
					mostrarProfesores(a);
				}else {
					System.out.println("Debe introducir primero.");
				}
				break;
			case 5:
				System.out.println("Agur!");
				break;
			default:
				System.out.println("Esa op no esta");
			}
		}while(op!=5);
		teclado.close();
	}
}
