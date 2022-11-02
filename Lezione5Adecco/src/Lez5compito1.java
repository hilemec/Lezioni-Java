import java.util.Scanner;

public class Lez5compito1 {

	public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			System.out.println("Inserisci una parola palindroma");
			String parola=key.nextLine();
			int index= parola.length()-1;
			String alorap = "";
			while(index>=0) {
				alorap+=parola.charAt(index);
				index--;
			}
			System.out.println(alorap);
			if(parola.equals(alorap))
				System.out.println("Bravo/a");
			else
				System.out.println(parola+"non è palindroma!");
			key.close();
			}
	}
