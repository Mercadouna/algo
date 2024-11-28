package reto1;
import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int dinero_calcular, dinero_calculado=0;
		System.out.println("Inserte una cantidad: ");
		dinero_calcular= teclado.nextInt();
		while (dinero_calcular >=500) {
			dinero_calculado++;
			dinero_calcular= dinero_calcular-500;
			
		}
		if(dinero_calculado >0) {
		System.out.println("Billetes de 500: "+ dinero_calculado);
		}
		dinero_calculado=0;
		
		
		while (dinero_calcular >=200) {
			dinero_calculado++;
			dinero_calcular= dinero_calcular-200;
			
		}
		if(dinero_calculado >0) {
		System.out.println("Billetes de 200: "+ dinero_calculado);}
		dinero_calculado=0;
		
		while (dinero_calcular >=100) {
			dinero_calculado++;
			dinero_calcular= dinero_calcular-100;
			
		}
		if(dinero_calcular >0) {
		System.out.println("Billetes de 100: "+ dinero_calculado);}
		dinero_calculado=0;
		
		while (dinero_calcular >=50) {
			dinero_calculado++;
			dinero_calcular= dinero_calcular-50;
			
		}
		if(dinero_calcular >0) {
		System.out.println("Billetes de 50: "+ dinero_calculado);}
		dinero_calculado=0;
		
		while (dinero_calcular >=20) {
			dinero_calculado++;
			dinero_calcular= dinero_calcular-20;
			
		}
		if(dinero_calculado >0) {
		System.out.println("Billetes de 20: "+ dinero_calculado);}
		dinero_calculado=0;
		
		while (dinero_calcular >=10) {
			dinero_calculado++;
			dinero_calcular= dinero_calcular-10;
			
		}
		if(dinero_calculado >0) {
		System.out.println("Billetes de 10: "+ dinero_calculado);}
		dinero_calculado=0;
		
		
		while (dinero_calcular >=5) {
			dinero_calculado++;
			dinero_calcular= dinero_calcular-5;
			
		}
		if(dinero_calculado >0) {
			System.out.println("Billetes de 5: "+ dinero_calculado);}
		
		dinero_calculado=0;
		
		while (dinero_calcular >=2) {
			dinero_calculado++;
			dinero_calcular= dinero_calcular-2;
			
		}
		if(dinero_calculado >0) {
			System.out.println("Monedas de 2: "+ dinero_calculado);}
		dinero_calculado=0;
		
		while (dinero_calcular >=1) {
			dinero_calculado++;
			dinero_calcular= dinero_calcular-1;
			
		}
		if(dinero_calculado >0) {
			System.out.println("Monedas de 1: "+ dinero_calculado);}
teclado.close();
	}
}

	
