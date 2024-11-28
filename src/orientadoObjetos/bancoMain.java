package orientadoObjetos;

import java.util.Scanner;

public class bancoMain {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System .in); 
		 int menu=0 ;
		 Banco a[] = new Banco [5];
		 int contador=0;
		 
		 do {
			 menu=menu(teclado);
			 switch (menu) {
			 case 1:
				 contador= introducir(teclado, a, contador);
				 break;
			 case 2:
				 if (contador>0) {
					 mostrar(teclado, a,contador);
				 }else {
					 System.out.println("No hay cuentas");
				 }
				 break;
			 case 3:
				 if (contador>0) {
					 ingCant(teclado, a, contador);
				 }else {
					 System.out.println("No hay cuentas");
				 }
				 
				 break;
			 case 4:
				 if (contador>0) {
					 retirarComision(a,contador);
				 }else {
					 System.out.println("No hay cuentas");
				 }
				
				 break;
			 case 5:
				 if (contador>0) {
					 mostMay(a, contador);
				 }else {
					 System.out.println("No hay cuentas");
				 }
				
				 break;
			 case 6:
				 if (contador>0) {
					 salsup (a, contador, teclado);
				 }else {
					 System.out.println("No hay cuentas");
				 }
				 break;
			 case 7:
				 if (contador>0) {
					 cuentaxnombre (a, contador, teclado);
				 }else {
					 System.out.println("No hay cuentas");
				 }
				 break;
			 case 8:
				 
				 break;
			 case 9:
				 
				 break;
			 case 10: // eliminar y compactar
				 
				 break;
			 case 11:
				 System.out.println("Hasta la vista!");
				 break;
			 default: 
				 System.out.println("Opcion incorrecta");
				 menu=11;
				 break;
			 	}
		 }while(menu!=11);	 
		 teclado.close();
	}

	public static int menu(Scanner teclado) {
		 int menu;
		 System.out.println("1. Introducir cuenta/s.");
		 System.out.println("2. Muestra las cuentas introducidas");
		 System.out.println("3. Ingresar una cantidad a un titular concreto introducido por teclado (Llama al método ingresar y controla la posibilidad de que no exista el titular)");
		 System.out.println("4. Retirar de todas las cuentas introducidas, la comisión de 12€ (Llama al método retirar)");
		 System.out.println("5. Muestra la cuenta de mayor saldo.");
		 System.out.println("6. Muestras las cuentas que tengan saldo superior a uno introducido por teclado. Si no hay, mensaje indicándolo.");
		 System.out.println("7. Muestra la cuenta de un titular concreto. Controlar si no encuentra.");
		 System.out.println("8. Muestra las cuentas de los titulares que contengan un grupo de letras, introducido por teclado, en su atributo titular");
		 System.out.println("9. Ordena y muestra las cuentas según su saldo (de mayor a menor saldo).");
		 System.out.println("10. Salir");
		 menu = teclado.nextInt();
		 return menu;
	}

	public static int contar(Banco a[]) {
		//devuelve num cuentas o -1 si esta completo
		boolean enc=false;
		for (int i = 0; i<a.length && !enc ;i++) {
			if (a[i]==null) {
				enc=true;
				return i;
			}
		}
		return -1;
	}
	
	public static int introducir(Scanner teclado, Banco a[], int contador) {
		String respuesta="";
	
		if (contador>a.length) {
			System.out.println("Error. No puedes introducir más cuentas ");
		
			
		}else {
			for (int i = contador; i < a.length && !respuesta.equalsIgnoreCase("no"); i++) {
				Banco c1=new Banco();
				a[i]=c1;
				System.out.println("Quien es el titular de la cuenta?");
				a[i].setTitular(teclado.next());
				System.out.println("Cuanta es la cantidad de dinero en la cuenta?");
				a[i].setCantidad(teclado.nextDouble());
				contador++;
				do {
					System.out.print("Quiere añadir otra cuenta?: ");
					respuesta = teclado.next();
					
					if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
						System.out.println("Las opciones válidas son Si/No");
					}
				} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));
			}
		}
		return contador;
	}

	public static void mostrar(Scanner teclado, Banco a[], int contador) {
		for (int i=0;i<contador;i++) {
			System.out.println(a[i].toString());
		}
	}

	public static void ingCant(Scanner teclado, Banco a[],int contador) {
		double dinero;
		int pos=buscarPorTitular(teclado, a,contador);
		if (pos==-1) {
			System.out.println("No existe");
		}else {
			System.out.println("Cuanto es la cantidad de dinero a ingresar?");
			dinero = teclado.nextDouble();
			a[pos].ingresar(dinero); 
			System.out.println("Se ha ingresado correctamente");
		}
		
	}
	
		public static int buscarPorTitular(Scanner teclado, Banco a[], int contador) {
			//busca la cuenta por titular y devuelve su posición o -1 si no lo encuentra
			String titular;
			
			System.out.println("A que titular le quieres ingresar dinero?");
			titular=teclado.next();
			for (int i=0; i<contador;i++) {
				if(titular.equalsIgnoreCase(a[i].getTitular())) {
					return i;
				}
			}
			return -1;
		}

		public static void retirarComision( Banco a[], int contador) {
			
			for (int i=0; i<contador;i++) {
				a[i].retirar(12);
			}
			System.out.println("Los 12 Euros se han retirado correctamente");
		}
		
		public static void mostMay(Banco a[], int contador) {
			double mayor=0;
			int pos=-1;
			
				for (int i=0; i<contador;i++) {
					if (a[i].getCantidad()>mayor) {
						mayor=a[i].getCantidad();
						pos=i;
					}
				
				System.out.println("La cuenta con mayor cantidad de dinero es: "+a[pos].toString());
			}
		}
		
		public static void salsup (Banco a[], int contador, Scanner teclado) {
			int sal;
			System.out.println("introduce el salario minimo");
			sal = teclado.nextInt();
			for (int i=0;i<contador;i++) {
				if (sal<a[i].getCantidad()) {
					System.out.println(a[i]);
				}
			}
			
			
		}
		public static void cuentaxnombre (Banco a[], int contador, Scanner teclado) {
			String nom;
			boolean hay=false;
			System.out.println("introduce el propietario de la cuenta");
			nom = teclado.next();
			for (int i=0;i<contador;i++) {
				if (nom.equalsIgnoreCase(a[i].getTitular())) {
					System.out.println(a[i]);
					hay=true;
				}
				if (!hay) {
					System.out.println("no existe la cuenta");
				}
			}
			
		}
}
