package ejercicos;
import java.util.Scanner;
public class Notas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double nota1,nota2,nota3,media = 0;
		int num,aprob = 0;
		
		System.out.println("introduzca la primera nota");
		nota1 = teclado.nextDouble();
		
		while (nota1<0 || nota1>10) {
			System.out.println("error");
			System.out.println("introduce la primera nota de nuevo");
			nota1 = teclado.nextDouble();
		}
		System.out.println("introduzca la segunda nota");
		nota2 = teclado.nextDouble();
		
		while (nota2<0 || nota2>10) {
			System.out.println("error");
			System.out.println("introduce la segunda nota de nuevo");
			nota2 = teclado.nextDouble();
		}
		System.out.println("introduzca la tercera nota");
		nota3 = teclado.nextDouble();
		
		while (nota3<0 || nota3>10) {
			System.out.println("error");
			System.out.println("introduce la tercera nota de nuevo");
			nota3 = teclado.nextDouble();
		}
		if (nota1>=5) {
			aprob++;
		}
		if (nota2>=5) {
			aprob++;
		}
		if (nota3>=5) {
			aprob++;
		}
		
		System.out.println("la nota media es" + (nota1+nota2+nota3)/3);
		
		System.out.println("aprobadas " + aprob);
		System.out.println("suspendidas " + (3-aprob));
		
		
	}

}
