package reto1;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int num_ayuda1,num_ayuda2;
		double num1, num2,result=1;
		char op='0';
		
		do {
			result=1;
			System.out.println("-----MENU----------------- ");
			System.out.println("Introduce el primer num: ");
			num1 = teclado.nextInt();
			System.out.println("Introduce el segundo num: ");
			num2 = teclado.nextInt();
			System.out.println("a) MCD ");
			System.out.println("b) MCM");
			System.out.println("c) Factorial de ambos");
			System.out.println("d) División");
			System.out.println("e) Elevar el primer nº al segundo sin usar la librería Math");
			System.out.println("f) Salir");
			op= teclado.next().charAt(0);
			
			switch(op) {
			case 'a':
				num_ayuda1 = (int) Math.max(num1, num2);
				num_ayuda2= (int) Math.min(num1, num2);
				do {
					result = num_ayuda2;
					num_ayuda2= num_ayuda1%num_ayuda2;
					num_ayuda1= (int) result;
				}while(num_ayuda2!=0);
				
				System.out.println("El resultado es: "+ result);
				break;
			case 'b':
				num_ayuda1 = (int) Math.max(num1, num2);
				num_ayuda2= (int) Math.min(num1, num2);
				do {
					result = num_ayuda2;
					num_ayuda2= num_ayuda1%num_ayuda2;
					num_ayuda1= (int) result;
				}while(num_ayuda2!=0);
				result= (int) ((num1/result)*num2);
				System.out.println("El resultado es: "+ result);
			break;
			case 'c':
				if(num1==0) {
				System.out.println("No hay factorial para el numero "+num1);
				}
				else {
					if(num1==1){
						System.out.println("El factorial es 1.");
					
					}else {
						for (int i = 1; i <= num1; i++) {
					           result = i * result;
					        }
						System.out.println("El factorial de "+num1+ " es "+result);
					}
				}
				if(num2==0) {
					System.out.println("No hay factorial para el numero "+num2);
				}		if(num2==1){
					System.out.println("El factorial es 1.");
					
				}else {
					result=1;
						for (int i = 1; i <= num2; i++) {
					           result = i * result;
						}
						System.out.println("El factorial de "+num2+ " es "+result);
				} break;
			case 'd':
				if(num2==0) {
					System.out.println("No se pueden hacer divisiones entre 0.");
				}
				else {
					result= num1/num2;
					System.out.println("El resultado es "+ result);
				}
				break;
			case 'e':
				for(int i=0;i<num2;i++) {
					result= num1*result;
				}
				System.out.println("El resultado es "+ result);
				
				break;
			}
				
			
		}while(op!='f');
		System.out.println("AGUR");
		teclado.close();
		
	}
}
