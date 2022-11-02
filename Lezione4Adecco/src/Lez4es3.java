import java.util.Scanner;

public class Lez4es3 {

	public static void main(String[] args) {
		/*
		 * creare un programma che prenda un numero da tastiera 
		 * che calcola la somma da 1 fino al numero inserito
		 */
		Scanner key = new Scanner(System.in);

		System.out.println("insert number");
		int max = key.nextInt();
		int somma = 0;
		while (max >= 1) {
			System.out.print(max+" + ");
			somma += max;
			max--;
		}
		System.out.print(" = "+somma);

		key.close();
	}

}
