package ejercicos;
import java.util.Scanner;
public class Ejemplosw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double num1;
		double num2;
		String opcion;
		
		System.out.println("introduzca el primer numero");
		num1 = teclado.nextDouble();
		System.out.println("introduzca el segundo numero");
		num2 = teclado.nextDouble();
		
		System.out.println("escoja la opcion de la operacion\r\n"
				+ "a.Sumar\r\n"
				+ "b.Restar\r\n"
				+ "c.Multiplicar\r\n"
				+ "d.Dividir\r\n"
				+ "e.Resto (%)\r\n"
				+ "f.Salir");
		
		opcion = teclado.next();
		switch (opcion) {
		
		case "a":
			System.out.println(num1 + num2);
			break;
		case "b":
			System.out.println(num1 - num2);
			break;
		case "c":
			System.out.println(num1 * num2);
			break;
		case "d":
			System.out.println(num1 / num2);
			break;
		case "f":
			System.out.println(num1 % num2);
			break;
		case "g":
			System.out.println("agur");
			break;
		}
			teclado.close();
		}
		
		
	}


