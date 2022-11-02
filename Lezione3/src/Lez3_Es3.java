import java.util.Scanner;

public class Lez3_Es3 {

	public static void main(String[] args) {
		Scanner tasti = new Scanner(System.in);
		System.out.println("Inserisci 3 numeri:");
		int numero1 = tasti.nextInt();
		int numero2 = tasti.nextInt();
		int numero3 = tasti.nextInt();
		
		if (numero1==numero2&&numero2==numero3) {
			System.out.println("Sono uguali");
			
		}
		else System.out.println("Sono diversi");
		
		tasti.close();
	}

}
