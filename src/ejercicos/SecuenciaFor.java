package ejercicos;

public class SecuenciaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10;i++) {
			if(i%2==0) {
				System.out.println(i + " par");
			}else if (i==5) {
				System.out.println("MITAD");
			}else {
				System.out.println(i);
			}
		}
	}

}
