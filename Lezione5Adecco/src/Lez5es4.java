import java.util.Scanner;

public class Lez5es4 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		String parola=key.nextLine();
		int index= parola.length()-1;
		String alorap = "";
		while(index>=0) {
			alorap+=parola.charAt(index);
			index--;
		}
		System.out.println(alorap);
		key.close();
	}

}