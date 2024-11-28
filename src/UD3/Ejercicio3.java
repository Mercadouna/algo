package UD3;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mayor=0,cont=0, cant=0;
		String [] m = {"enero", "febrero", "marzo", "abril", "mayo"};
		int [] l = {123, 333, 180, 211, 90};
		
		for (int i=0; i<m.length; i++) {
			System.out.println(m[i] + " " + l[i]);
		}
		while (cont<m.length-1) {
			if (l[cont] > cant) {
				mayor = cont;
				cant = l[cont];
			}
			cont++;
			if(cont==m.length-1) {
			System.out.println("el mes mas lluvioso ha sido " + m[mayor] + " con " + l[mayor] + " litros");
			}
			}
		
		}
		
	}


