import java.util.Scanner;

public class Lez3_Es2 {

	public static void main(String[] args) {
		Scanner tasti = new Scanner(System.in);
		System.out.println("Inserisci due numeri e premi invio: ");
		int numero1 = tasti.nextInt();
		int numero2 = tasti.nextInt();
		if (numero1 == numero2) {
			System.out.println("I due numeri sono uguali");
		} else {
			System.out.println("I due numeri sono diversi");
		}
		String ris = numero1 == numero2 ? "Sono uguali" : "Sono diversi";
		System.out.println(ris);
		tasti.close();
	}

}
