import java.util.Scanner;

public class Lez5es3 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("scrivi una parola");
		String parola1= key.nextLine();
		System.out.println("scrivine un'altra");
		String parola2= key.nextLine();
		int lunghezza1= parola1.length();
		int lunghezza2= parola2.length();
		int index=0;
		String parolona = "";
		if (lunghezza1==lunghezza2) {
			while(index<lunghezza1) {
				parolona+= parola1.charAt(index);
				parolona+= parola2.charAt(index+1);
				index+=2;	
			}
			System.out.println("La parola cocktail è:);
			System.out.println(parolona);
			
		} else
			System.out.println("Impossibile proseguire");
		key.close();
	}
}
