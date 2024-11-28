package UD3;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0, cant=0, mayor=0;
		String [] a = {"Jon", "Sara", "Ander", "Marta", "Jone", "Mikel"};
		int [] e = {18,20,26,21,17,24};
		
		
		while (cont<a.length-1) {
			if (e[cont] > cant) {
				mayor = cont;
				cant = e[cont];
			}
			cont++;
			if(cont==a.length-1) {
			System.out.println("el alumno mas mayor es " + a[mayor] + " con " + e[mayor] + " años");
			}
			}
		mayor = 0;
		cont = 0;
		cant = 0;
		while (cont<a.length-1) {
			if (cont == 0) {
				cant=e[cont];
			}
			if (e[cont] < cant) {
				mayor = cont;
				cant = e[cont];
			}
			cont++;
			if(cont==a.length-1) {
			System.out.println("el alumno con menos años es " + a[mayor] + " con " + e[mayor] + " años");
			}
			}
	}

}
