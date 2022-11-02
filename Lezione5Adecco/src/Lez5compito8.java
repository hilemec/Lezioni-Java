import java.util.Scanner;

public class Lez5compito8 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int index = 5;
		int somma = 0;
		while(index>0) {
			System.out.println("Inserisci un numero");
			int numero = key.nextInt();
			if(numero%2==0) {
				somma += numero;
				index--;
				}
			else
				index--;
			}
		System.out.println("La somma è uguale a "+somma);
		key.close();

	}

}
