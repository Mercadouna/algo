package reto1;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String nombre_mejor="e", nombre_variable,op="0";
		int diferencia;
		int mejor_porcentaje=0, porcentaje;
		int antes, durante, ahora;
		do {
			System.out.println("Introduzca el nombre del atleta");
			nombre_variable= teclado.next();
			System.out.println("Cual es su frecuencia cardiaca antes de correr?");
			antes= teclado.nextInt();
			System.out.println("Cual es su frecuencia cardiaca mientras corre?");
			durante= teclado.nextInt();
			System.out.println("Cual es su frecuencia cardiaca despues de correr?");
			ahora= teclado.nextInt();
			if(antes<0||durante<0||ahora<0) {
				System.out.println("Los valores tienen que ser positivos");
			}else {
				diferencia= durante-antes;
				porcentaje=(diferencia*100)/ahora;
				if(porcentaje==100) {
					System.out.println("Atleta en excelente condición");
				}else {
					if(60<porcentaje && porcentaje<=99 ){
						System.out.println("Atleta en buena condición, pero necesita mejorar");
					}
					else {
						System.out.println("Atleta en mala condición, requiere atención médica");
					}
				}
				if(porcentaje>mejor_porcentaje) {
					nombre_mejor=nombre_variable;
					mejor_porcentaje= porcentaje;
				}
				System.out.println("Quiere seguir introduciendo altletas?");
				op= teclado.next().toLowerCase();
			}
		}while(!op.equals("no"));
		System.out.println("El atleta con mejor rendimiento es "+nombre_mejor);
		teclado.close();
	}}


