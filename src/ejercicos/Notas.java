package ejercicos;
import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double num;
		double notaex;
		double notauex;
		double notatr;
		String nom;
		String contr;
		char letr = 'e';
		int menu;
		String ape;
		
		System.out.println("introduzca un nombre de usuario");
		nom = teclado.next();
		System.out.println("introduzca una contraseña");
		contr = teclado.next();
		
	
		while (contr.indexOf(letr) > -1) {
		System.out.println("la contraseña no puede contener la letra e");
		System.out.println("introduzca un nombre de usuario");
		nom = teclado.next();
		System.out.println("introduzca una contraseña");
		contr = teclado.next();
		}
		
		System.out.println("1. calcular las notas\n 2. salir");
		
		switch (menu) {
		
			case 1:
				System.out.println("introduce el nombre del alumno");
				nom = teclado.next();
				System.out.println("introduce el apellido del alumno");
				
				do {
				System.out.println("introduzca la primera nota");
				notaex = teclado.nextDouble();
				
				System.out.println("la nota no puede tener numeros negativos");
					
				
					
				
				
				
			
			
		}
		
	
		
	}

}
