package proyectoEmpleadosJefes;
import java.util.ArrayList;
import java.util.Scanner;



import java.util.Iterator;
public class MainEmpleado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		ArrayList <Empleados> a = new ArrayList();
int ele;
		
		do {
			ele = mostrarMenu(teclado);
			switch (ele) {
				case 1:
					introducir (teclado, a);
					break;
			
			
			
			
			}
			}while(ele!=7);
			

			teclado.close();
		
		
		
		
	}
	public static int mostrarMenu(Scanner teclado) {
		int ele;
		System.out.println("\n1-. Introducir datos de empleados o jefes");
		System.out.println("2-Visualizar todos los datos");
		System.out.println("3-Visualizar los jefes");
		System.out.println("4-Visualizar los jefe de un departamento concreto");
		System.out.println("5-Introducir nombre o al menos un grupo de caracteres del nombre y visualizar el DNI/s y los\r\n"
				+ "años que lleva/n en la empresa indicando si es/son o no jefe");
		System.out.println("6-Introducir un salario y mostrar aquellos empleados cuyo salario final es igual o superior al\r\n"
				+ "introducido");
		System.out.println("7-Ordenar el listado de furgonetas por tara y mostrarlo ");
		System.out.println("8-Introducir un nº de años y mostrar los jefes que lleven en la empresa esos o más años");
		System.out.println("9-Dar de baja a un empleado/jefe a partir de su DNI");
		System.out.println("10-Salir");

		System.out.println("¿Qué quieres hacer?");
		ele = teclado.nextInt();
		return ele;
	
		
			}
		
	public static void introducir (Scanner teclado, ArrayList <Empleados> a) {
		int opcion=0, pos, mesEntrada, añoEntrada, sueldoBase;
		String Dni, nomEmpl, nomDEpartamento;
		double porcentajeIncrementoSueldo;
		boolean encontrado=false;
		while(opcion!=1 && opcion!=2) {
			System.out.println("Que quieres introducir? 1.Empleado 2.Jefe");
			opcion = teclado.nextInt();
		}
			System.out.println("DNI: ");
			Dni= teclado.next();
			
			for(int i=0;i<a.size()&&!encontrado;i++) {
				if(a.get(i).getDni().equalsIgnoreCase(Dni)) 
				{
					encontrado=true;
				}
				
			}

			if (encontrado==true) 
			{	
				System.out.println("el trabajador ya esta introducido");
			}else {
				System.out.println("Nombre: ");
				nomEmpl=teclado.next();
				
				System.out.println("Mes de entrada: ");
				mesEntrada=teclado.nextInt();
				System.out.println("Año de entrada: ");
				añoEntrada=teclado.nextInt();
				System.out.println("Porcentaje de incremento del sueldo: ");
				porcentajeIncrementoSueldo=teclado.nextDouble();
				System.out.println("Sueldo base: ");
				sueldoBase=teclado.nextInt();
				if (opcion==2) {
					System.out.println("Nombre del departamento");
					nomDEpartamento=teclado.next();
				}
		
			}

	}
}
		
		
		
	


