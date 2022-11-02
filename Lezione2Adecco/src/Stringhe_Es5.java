import java.util.Scanner;

public class Stringhe_Es5 {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);

		System.out.println("Scrivi una parola");
		
		String parola1 = tastiera.nextLine();

		System.out.println("scrivine un'altra");
		
		String parola2 = tastiera.nextLine();
		
		if (parola1.length()>=parola2.length()) {
			System.out.println("\nLa parola più lunga è "+parola1);
			}
		else
			System.out.println("\nLa parola più lunga è "+parola2);
		
		tastiera.close();
	}

}
