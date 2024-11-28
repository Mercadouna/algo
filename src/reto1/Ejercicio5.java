package reto1;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Random random = new Random();
		int num,num2,dif,cont=0,num3,rand;
		
		
		
		do {
			System.out.println("los numeros deven de ser diferentes");
			System.out.println("introduce un numero");
			num = teclado.nextInt();
			System.out.println("introduce otro numero");
			num2 = teclado.nextInt();
		} while (num == num2);
		
		if (num>num2) {
			dif = (num - num2);
			rand = random.nextInt(num2);
			rand = (rand + dif);
		}else {
			dif = (num2 - num);
			rand = random.nextInt(num) + dif;
		}
		
		 
		 
		if (dif<=10) {
			System.out.println("tienes 4 oportunidades para adivinar el numero");
			do {
				System.out.println("introduce un numero");
				num3 = teclado.nextInt();
				if (num3 == rand) {
					cont++;
					System.out.println("has usado " + cont + " intentos");
					break;
				}else {
					if (num3>rand) {
						System.out.println("el numero es menor a " + num3);
						cont++;
					}else {
						System.out.println("el numero es mayor a " + num3);
						cont++;
						if (cont == 4) {
							System.out.println("GaMe OvEr");
						}
					}
					
				}
			}while (cont<4);
			
		}
		
		if (dif>=11 && dif<=50) {
			System.out.println("tienes 6 oportunidades para adivinar el numero");
			do {
				System.out.println("introduce un numero");
				num3 = teclado.nextInt();
				if (num3 == rand) {
					cont++;
					System.out.println("has usado " + cont + " intentos");
					break;
				}else {
					if (num3>rand) {
						System.out.println("el numero es menor a " + num3);
						cont++;
					}else {
						System.out.println("el numero es mayor a " + num3);
						cont++;
						if (cont == 6) {
							System.out.println("GaMe OvEr");
						}
					}
					
				}
			}while (cont<6);
			
		}if (dif>50) {
			System.out.println("tienes 9 oportunidades para adivinar el numero");
			do {
				System.out.println("introduce un numero");
				num3 = teclado.nextInt();
				if (num3 == rand) {
					cont++;
					System.out.println("has usado " + cont + " intentos");
					
				}else {
					if (num3>rand) {
						cont++;
						System.out.println("el numero es menor a " + num3);
					}else {
						cont++;
						System.out.println("el numero es mayor a " + num3);
						
						if (cont == 9) {
							System.out.println("GaMe OvEr");
						}
					}
					
				}
			}while (cont<9);
		
		}
		teclado.close();
	}

}
