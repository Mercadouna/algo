package ejercicos;
import java.util.Scanner;
public class Menuif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion;
		double num1;
		double num2;
		
		System.out.println("escoja la opcion de la operacion\r\n"
				+ "1.Sumar\r\n"
				+ "2.Restar\r\n"
				+ "3.Multiplicar\r\n"
				+ "4.Dividir\r\n"
				+ "5.Resto (%)\r\n"
				+ "0.Salir");
		opcion = teclado.nextInt();
		if (opcion == 1) {
			System.out.println("introduzca el primer numero");
			num1 = teclado.nextDouble();
			System.out.println("introduzca el segundo numero");
			num2 = teclado.nextDouble();
			System.out.println(num1 + num2);
		}else if (opcion == 2) {
			System.out.println("introduzca el primer numero");
			num1 = teclado.nextDouble();
			System.out.println("introduzca el segundo numero");
			num2 = teclado.nextDouble();
			System.out.println(num1 - num2);
		}else if (opcion == 3) {
			System.out.println("introduzca el primer numero");
			num1 = teclado.nextDouble();
			System.out.println("introduzca el segundo numero");
			num2 = teclado.nextDouble();
			System.out.println(num1 * num2);
		}else if (opcion == 4) {
			System.out.println("introduzca el primer numero");
			num1 = teclado.nextDouble();
			System.out.println("introduzca el segundo numero");
			num2 = teclado.nextDouble();
			System.out.println(num1 / num2);
		}else if (opcion == 5) {
			System.out.println("introduzca el primer numero");
			num1 = teclado.nextDouble();
			System.out.println("introduzca el segundo numero");
			num2 = teclado.nextDouble();
			System.out.println(num1 % num2);
		}else if (opcion == 0) {
			System.out.println("agur");
		}
		teclado.close();
	}

}
