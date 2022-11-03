import java.util.Scanner;

public class Lez6es0 {
												// inizio cicli indefiniti
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int userNumber = 0;

		do {
			System.out.println("inserisci un numero");
			userNumber = in.nextInt();

		} while (userNumber >= 0);

		System.out.println("\nFine");
		in.close();

	}

}
