package reto1;

import java.util.Scanner;

public class Ejercicioreto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int dias_trabajados, tareas=0, tareastotales=0;
		float sueldo=0, tareasbonus=0, num_tareas_bonus, sueldobonus=0, gastoempresa=0;
		String seguir;

		do {

			do {
				System.out.println("Cuantos dias ha trabajado?");
				dias_trabajados = teclado.nextInt();
				if (1>dias_trabajados || dias_trabajados>7){
					System.out.println("Introduce un numero entre 1-7");
				}
			}while(1>dias_trabajados || dias_trabajados>7);

			do {
				System.out.println("Cuantas tareas ha realizado cada dia?");
				tareas = teclado.nextInt();	
				if(tareas<1) {
					System.out.println("Las tareas deben ser al menos 1 al dia");
				}
			}while(tareas<1);

			tareastotales=tareas*dias_trabajados;
			System.out.println("Las tareas semanales totales son "+tareastotales);

			if(tareas>10) {
				num_tareas_bonus=(tareas-10)*dias_trabajados;
				tareasbonus=(float) (num_tareas_bonus*(12.50*1.5));
				sueldobonus = (float) ((12.50*(tareastotales-num_tareas_bonus))+tareasbonus);

				sueldo=(float)(tareastotales*(12.50));

				if(sueldo+(sueldo*0.25)>sueldobonus) {
					System.out.println("\nBONUS AÑADIDO. Tu sueldo es "+sueldobonus+" porque el sueldo semanal con el bonus no excede el 25% del sueldo total sin el bonus");
					gastoempresa=gastoempresa+sueldobonus;
				}else {
					System.out.println("\nBONUS NO AÑADIDO. Tu sueldo es "+sueldo+" porque el sueldo semanal con el bonus excede el 25% del sueldo total sin el bonus");
					gastoempresa=gastoempresa+sueldo;
				}

			}else {
				sueldo=(float)(tareastotales*(12.50));	
				System.out.println(" \nTu sueldo es "+sueldo+ " por que no hiciste tareas de más.");
				System.out.println(sueldo);
				gastoempresa=gastoempresa+sueldo;
			}

			do {
				System.out.println("\nQuieres seguir calculando sueldos de empleados?");
				seguir = teclado.next();
				if(!seguir.equalsIgnoreCase("si") && !seguir.equalsIgnoreCase("no")) {
					System.out.println("Introduce Si o No");
				}

			}while (!seguir.equalsIgnoreCase("si") && !seguir.equalsIgnoreCase("no"));


		}while(seguir.equalsIgnoreCase("Si"));

		System.out.println("El gasto completo de la empresa es "+gastoempresa);
		System.out.println("COMPLETADO. Hasta luego!");
		teclado.close();
	







	}

}
