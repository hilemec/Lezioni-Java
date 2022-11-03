import java.util.Scanner;

public class Lez6es3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci dei numeri e 0 per fermare:");
		int somma = 0, numeriInseriti = 0;
		int numeri = in.nextInt();

		while (numeri != 0) {
			somma += numeri;
			numeriInseriti++;
			numeri = in.nextInt();
		}
		System.out.println("Somma = " + somma);
		System.out.println("Numeri inseriti = " + numeriInseriti);
		double media = 1.0 * somma / numeriInseriti;

		System.out.println("Media numeri inseriti = " + media);
		in.close();

	}

}
