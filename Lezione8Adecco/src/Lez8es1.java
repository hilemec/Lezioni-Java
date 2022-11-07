import java.util.Scanner;
public class Lez8es1 {

	public static void main(String[] args) {
		double[] vettDouble = { 1.02967, 3.745453, 8.134, 7.7435 };
		Scanner in = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Inserisci un numero diverso da 0:");
			numero = in.nextInt();
		} while (numero==0);
		System.out.println("Il nuovo vettore è:");
		for (int i = 0; i < vettDouble.length; i++) {
			vettDouble[i]*=numero;
			System.out.print(vettDouble[i]+" ");
		}	
		in.close();
	}

}
