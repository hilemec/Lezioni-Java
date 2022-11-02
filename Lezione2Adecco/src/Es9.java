import java.util.Scanner;

public class Es9 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);

		System.out.println("Scrivi quanti minuti vuoi: ");
		
		int minuti = tastiera.nextInt();
		
		if (minuti<0) {
			System.out.println("\n Non valgono i numeri negativi");
			}
		else
			System.out.println("\n Hai inserito "+(minuti*60)+" secondi");
		
		
		
		tastiera.close();
	}

}
