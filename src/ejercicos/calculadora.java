package ejercicos;
import java.util.Scanner;
public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opc;
		String opc1;
		double num1,num2;
		
		System.out.println("escoja una opcion");
		System.out.println("1. operaciones basicas\r\n"
				+ "2. operaciones complejas \r\n"
				+ "3. terminar programa");
		opc = teclado.nextInt();
		
		switch (opc) {
		case 1:
			System.out.println("escoja el tipo de operacion");
			System.out.println("a. Suma\r\n"
					+ "b. Resta\r\n"
					+ "c. Multiplicación\r\n"
					+ "d. División\r\n");
			opc1 = teclado.next();
			switch (opc1) {
			case "a":
				System.out.println("introduce el primer numero");
				num1 = teclado.nextDouble();
				System.out.println("introduce el segundo numero");
				num2 = teclado.nextDouble();
				System.out.println("el resultado es: " + (num1+num2));
			case "b":
				System.out.println("introduce el primer numero");
				num1 = teclado.nextDouble();
				System.out.println("introduce el segundo numero");
				num2 = teclado.nextDouble();
				System.out.println("el resultado es: " + (num1-num2));
			case "c":
				System.out.println("introduce el primer numero");
				num1 = teclado.nextDouble();
				System.out.println("introduce el segundo numero");
				num2 = teclado.nextDouble();
				System.out.println("el resultado es: " + (num1*num2));
			case "d":
				System.out.println("introduce el primer numero");
				num1 = teclado.nextDouble();
				System.out.println("introduce el segundo numero");
				num2 = teclado.nextDouble();
				System.out.println("el resultado es: " + (num1/num2));
			}
		case 2:
			System.out.println("escoja el tipo de operacion");
			System.out.println("a. Potencias\r\n"
					+ "b. Raíz cuadrada");
			opc1 = teclado.next();
			switch (opc1) {
				case "a": 
					System.out.println("introduce el primer numero");
					num1 = teclado.nextDouble();
					System.out.println("introduce el segundo numero");
					num2 = teclado.nextDouble();
				
			}
			
			
		}
		
		
	}

}
