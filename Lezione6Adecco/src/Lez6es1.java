import java.util.Scanner;

public class Lez6es1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int userNumber = 0;
		int numeriPari = 0;
		int numeriDispari = 0;
		do {
			System.out.println("inserisci un numero");
			
			userNumber = in.nextInt();
			
			if (userNumber % 2 == 0)
				numeriPari += 1;
			else
				numeriDispari += 1;

		} while (userNumber != -1);

		System.out.println("\nHai inserito " + numeriPari + " numeri pari e "+
								numeriDispari+" dispari.");
		in.close();
	}
}
