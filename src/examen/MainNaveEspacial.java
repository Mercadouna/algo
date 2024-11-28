package examen;

import java.time.LocalDate;
import java.util.Scanner;

import EjercicioLibro.Libro;



public class MainNaveEspacial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		int contador=0;
		NaveEspacial[] a = new NaveEspacial[50];
		do {
			opcion = mostrarMenu(teclado);
			switch (opcion) {
				case 1:
					contador = introducirNave (teclado, contador, a);
					break;
				case 2:
					antiguedadSup (a, teclado);
					break;
				case 3:
					if(contador==0) {
						System.out.println("No hay naves");
					}else {
						ordenar(a, teclado, contador);
					}
					break;
				case 4:
					
					break;
				case 5:
					if(contador==0) {
						System.out.println("No hay naves introducidas");
					}else {
						mostrar(contador,a);
					}
					break;
				case 6:
					break;
				case 7:
					System.out.println("ADIOS");
					break;
			}
		}while(opcion!=7);

		teclado.close();
			
		
		
	}
	
	public static int mostrarMenu(Scanner teclado) {
		int opcion;
		System.out.println("\n1-Añadir Naves Espaciales");
		System.out.println("2-Mostrar naves cuya antiguedad sea superior a una dada");
		System.out.println("3-ordenar naves por año de lanzamiento");
		System.out.println("4-Modificar la capacidad total de las naves que admiten pasajeros");
		System.out.println("5-Mostrar todas las naves espaciales regidtradas");
		System.out.println("6-Eliminar una nave espacial");
		System.out.println("7-Salir");

		System.out.println("¿Qué quieres hacer?");
		opcion = teclado.nextInt();
		return opcion;
	}
	
	public static int introducirNave(Scanner teclado, int contador, NaveEspacial a[]) {
		String respuesta = "si";
		String nombre;
		int AñoCreacion;
		int AñoLanzamiento;
		int CapTot;
		int NumTrip;
		int pos;
		if(contador>=a.length) 
		{
			System.out.println("No hay espacio para mas naves");
		}else {
			
			
			
			for(int i=contador;i<a.length&&respuesta.equalsIgnoreCase("si");i++) 
			{
				System.out.println("Introduce el año de creacion");
				AñoCreacion= teclado.nextInt();
				System.out.println("Introduce el año de Lanzamiento");
				AñoLanzamiento= teclado.nextInt();
			
				
				if (AñoCreacion<AñoLanzamiento) 
				{
					System.out.println("nombre:");
					nombre=teclado.next();
					System.out.println("Capacidad total de la nave: ");
					CapTot = teclado.nextInt();
					System.out.println("Numero de tripulantes:");
					NumTrip= teclado.nextInt();
					

					NaveEspacial l1 = new NaveEspacial(nombre, AñoCreacion, AñoLanzamiento, CapTot, NumTrip);
					a[i]=l1;
					contador++;

					do 
					{
						System.out.print("Quiere añadir otra nave?: ");
						respuesta = teclado.next();

						if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) 
						{
							System.out.println("Las opciones válidas son Si/No");
						}
					} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));

				}else {
					System.out.println("Error: el año de lanzamiento no puede ser anterior al año de creacion");
				}

			}
		}
		
		

		return contador;
	}
	
	public static void antiguedadSup (NaveEspacial a[], Scanner teclado)  {
		String antig;
		System.out.println("introduce la antiguedad minima");
		antig=teclado.next();
		for (int i=0; i<a.length-1&&a[i]!=null; i++) {
			if (LocalDate.now().getYear()>a[i].getAñoCreacion()) {
				System.out.println(a[i].toString());
			}
		}
	}
	
	
			public static int buscarNave(String Nombre, NaveEspacial a[], int contador) {
				boolean encontrado=false;

				for (int i=0; i<contador&&!encontrado;i++) 
				{
					if(Nombre.equalsIgnoreCase(a[i].getNombre())) 
					{
						encontrado=true;
						return i;
					}
				}
				return -1;
			}
			
			public static void ordenar (NaveEspacial a[], Scanner teclado, int contador) {
				NaveEspacial l1; 
				boolean encontrado=false;
				
					for(int i=0; i<a.length-1; i++)
					{
						for(int j=0; j<(a.length-1-i) && a[j+1]!=null; j++){ 
							if(a[j].getAñoLanzamiento()<a[j+1].getAñoLanzamiento()){ 
								l1=a[j];
								a[j]=a[j+1];
								a[j+1]=l1;
							}   
						}
					}

			}
			
			public static void mostrar(int contador,NaveEspacial a[]) {
				System.out.println("Estas son las naves: ");
				for(int i=0;i<contador;i++) {
					System.out.println(a[i].toString());
				}
			}
	
			public static int eliminarPorNombre(Scanner teclado, NaveEspacial a[], int contador) {
				String nombre, respuesta="";
				int pos=0;

				System.out.println("Introduce el nombre de la nave:");
				nombre = teclado.next();
				pos=buscarNave(nombre, a, contador);

				if(pos!=-1) {
					do 
					{
						System.out.println("Seguro que quiere borrar la nave?");
						respuesta = teclado.next();
						if(!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no")) 
						{
							System.out.println("Introduce Si o No");
						}
					}while(!respuesta.equalsIgnoreCase("si")&&!respuesta.equalsIgnoreCase("no"));

					if(respuesta.equalsIgnoreCase("si")) 
					{

						a[pos]=null;
						contador--;
						for(int i=pos;i<contador;i++) {
							a[i]=a[i+1];
						}
						a[contador]=null;
						System.out.println("Nave eliminada");

					}else {
						System.out.println("Eliminacion cancelada");

					}
				}else {
					System.out.println("La nave no existe");
				}
				return contador; 
			}
			
			

}
