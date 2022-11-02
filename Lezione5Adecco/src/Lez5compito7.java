import java.util.Scanner;

public class Lez5compito7 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int index = 5;
		int somma = 0;
		while(index>0) {
			System.out.println("Inserisci un numero");
			int numero = key.nextInt();
			somma += numero;
			index--;
			}
		System.out.println("La somma è uguale a "+somma);
		key.close();
		}	

}
