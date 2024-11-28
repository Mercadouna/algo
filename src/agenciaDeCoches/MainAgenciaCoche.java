package agenciaDeCoches;

import java.util.Scanner;

import EjercicioLibro.Libro;
import examen.NaveEspacial;

public class MainAgenciaCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		AgenciaCoches[] a1 = new AgenciaCoches[50];
		coche [] c1 = new coche [50];
		Furgoneta [] f1 = new Furgoneta [50];
		AgenciaCoches.contador++;
		Furgoneta.setCarga(300);
		int ele;
		
		do {
			ele = mostrarMenu(teclado);
			switch (ele) {
				case 1:
					break;
			
			
			
			
			}
			}while(ele!=7);
			

			teclado.close();
		
		
		
		
	}
	public static int mostrarMenu(Scanner teclado) {
		int ele;
		System.out.println("\n1-Introducir un nuevo vehículo");
		System.out.println("2-Listar los datos de los coches que sean descapotables");
		System.out.println("3-furgonetas con una tara menor a la introducida");
		System.out.println("4-nueva carga para todas las furgonetas");
		System.out.println("5-Mostrar los datos de la furgoneta más antigua y más nueva");
		System.out.println("6-Mostrar la antigüedad media de los coches, de las furgonetas y de los vehículos");
		System.out.println("7-Ordenar el listado de furgonetas por tara y mostrarlo ");
		System.out.println("8-Listar todos los vehículos ordenados por matrícula");
		System.out.println("9-Introducir una matrícula y borrar dicho vehículo");
		System.out.println("10-Salir");

		System.out.println("¿Qué quieres hacer?");
		ele = teclado.nextInt();
		return ele;
	}
	
	public static void introducir(Scanner teclado, AgenciaCoches a1[], Furgoneta f1[], coche c1[]) {
		int ele;
		String matricula;
		String marca;
		String modelo;
		int  añosDeAntiguedad;
		int precioAlquilerPorDia;
		
		if(AgenciaCoches.contador>=a1.length) 
		{
			System.out.println("no caben mas coches");
		}else {
		System.out.println("quieres añadir un coche o una furfoneta? (coche = 1 // furgonete = 2");
		ele = teclado.nextInt();
		switch (ele) {
			case 1:
				System.out.println("introduce la matricula");
				matricula = teclado.next();
				if (buscarMatricula(matricula, a1)==-1) {
					System.out.println("el coche ya existe");
				}else {
					System.out.println("introduce la marca");
					marca=teclado.next();
					System.out.println("introduce el modelo");
					modelo=teclado.next();
					System.out.println("introduce los años de antiguedad del coche");
					añosDeAntiguedad=teclado.nextInt();
					System.out.println("introduce el precio del alquiler por dia");
					precioAlquilerPorDia=teclado.nextInt();
					
				}
				
				
		
		}
		}
		
		
		
	}
	
	public static int buscarMatricula(String matricula, AgenciaCoches a1[]) {
		boolean encontrado=false;

		for (int i=0; i<AgenciaCoches.contador&&!encontrado;i++) 
		{
			if(matricula.equalsIgnoreCase(a1[i].getMatricula())) 
			{
				encontrado=true;
				return i;
			}
		}
		return -1;
	}
	
}
