package ejercicos;
import java.util.Scanner;
public class Tabnotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double nota;
		
		System.out.println("Introduzca su nota");
		nota = teclado.nextDouble();
		if (nota>=0 && nota<3) {
			System.out.println("MD");
		}else if (nota<5){
			System.out.println("INS");
		}else if (nota<6) {
			System.out.println("SUF");
		}else if (nota<7) {
			System.out.println("BIEN");
		}else if (nota<9) {
			System.out.println("NOT");
		}else if (nota<=10) {
			System.out.println("SOBRE");
		}
		
		teclado.close();
	}

}
