package reto1;

import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int num, mult1, mult2,resultado=1, resultado2=1;
				
		do {
			System.out.println("Introduce un numero: ");
			num = teclado.nextInt();
			if(50>num || num>350) {
				System.out.println("El numero debe estar entre 50 y 350");
			}
		}while (50>num || num>350);
		
		do {
			do {
				System.out.println("Introduce el primer numero: ");
				mult1 = teclado.nextInt();
				if(mult1<1 || mult1>10) {
					System.out.println("El numero debe estar entre 1 y 10");
				}
			}while (mult1<1 || mult1>10);
			
			do {
				System.out.println("Introduce el segundo numero: ");
				mult2 = teclado.nextInt();
				if(mult2<1 || mult2>10) {
					System.out.println("El numero debe estar entre 1 y 10");
				}
			}while (mult2<1 || mult2>10);
		
			if(mult1==mult2) {
			System.out.println("Los numeros deben ser diferentes");
			}
			
		}while(mult1==mult2);
		
		for(int i=1;resultado<num && resultado2<num;i++) {
						
			resultado=mult1*i;
			System.out.print(+resultado+" ");
			resultado2=mult2*i;
			System.out.print(+resultado2+" ");
			
		}
		
		teclado.close();
	}


	}


