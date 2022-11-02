import java.util.Scanner;

public class Lez4formula1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("insert number\n");
		int numero = key.nextInt();
		double parte1=(2*Math.E*Math.PI)/7;
		double parte2=Math.sqrt(5*Math.PI);
		double risultato = 1;
		if(numero<1) {
			System.err.println("Non posso calcolare");
			System.exit(0);
		}
		
		if(numero>=1) {
			risultato=(parte1+parte2+numero)/(9*Math.E);
			System.out.println(risultato);
		}
		key.close();
	}

}
