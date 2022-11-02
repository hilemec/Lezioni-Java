import java.util.Scanner;

public class Lez5compito4 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int numero = key.nextInt();
		System.out.println("Inseriscine un altro");
		int divisore = key.nextInt();
		if(numero%divisore==0)
			System.out.println("Il numero "+divisore+" è un divisore di "+numero);
		else
			System.out.println("Il numero "+divisore+" non è divisore di "+numero);
		key.close();
	}

}
