import java.util.Scanner;

public class Lez5es2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Scrivi qualcosa");
		String parola = key.nextLine();
		System.out.println("Le lettere pari sono:");
		int index=0;
		while(index<parola.length()) {
			if (index%2==0)
				System.out.print(parola.charAt(index));
			index++;
		}
		// altro metodo
		System.out.println("");
		System.out.println("confermo");
		index = 0;
		while(index<parola.length()) {
			System.out.print(parola.charAt(index));
			index+=2;
		}
		key.close();
	}
		
}
