package ejercicos;
import java.util.Scanner;
public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		double tipointeres;
		double cantidad;
		int tiempo;
		
		System.out.println("Introduzca el porcentaje de interes");
		tipointeres = teclado.nextDouble();
		System.out.println("Introduzca la cantidad de dinero en euros");
		cantidad = teclado.nextDouble();
		System.out.println("Introduzca el tiempo transcurrido");
		tiempo = teclado.nextInt();
		System.out.println("el interes es del " + tipointeres*tiempo*cantidad/36000 + "%");
		
		teclado.close();
		
	}

}
