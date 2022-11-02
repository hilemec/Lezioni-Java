import java.util.Scanner;

public class Lez5compito2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		String parola = key.nextLine();
		System.out.println("ora un numero");
		int numero = key.nextInt();
		System.out.println("---------------------");
		while(numero>0) {
			System.out.print(parola+" ");
			numero--;
		}
		key.close();
	}

}
