import java.util.Scanner;

public class Lez2_es3 {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);

		System.out.println("Scrivi qualcosa:");

		String frase = tastiera.nextLine().trim();

		System.out.println("\nLa tua frase va da 0 a " + (frase.length() - 1));

		System.out.println("\nScrivi un numero compreso nel range sopra:");

		int numero = tastiera.nextInt();

		System.out.println("\nHai scelto il carattere " + frase.charAt(numero));

		tastiera.close();
	}

}
// input una stringa la stampa e ne stampa il range di quella stringa,
// poi prende un numero intero da tastiera e stampa il carattere alla posizione
// nella stringa del numero appena passato
