package gordisMain;
import java.util.ArrayList;

import gordisClases.Persona;
import utilidades.Utilidades;
public class Main {
	private static void mostrarMenu() {
		System.out.println("Escoja una opcion: ");
		System.out.println("1. ALTA GORDI/PESADOR");
		System.out.println("2. LISTADO DE GORDIS");
		System.out.println("3. AÑADIR UNA MEDICIÓN A UN GORDI Y VER SU EVOLUCIÓN");
		System.out.println("4. ESTADISTICA DE GORDIS");
		System.out.println("5. SALIR");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0;
		ArrayList <Persona> a  = new ArrayList <>();
		
		
		
		do {
		mostrarMenu();
		opcion = Utilidades.leerInt();
		switch (opcion) {
			case 1: 
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
		
		
		}
		
		
		}while (opcion!=5);
	}
}