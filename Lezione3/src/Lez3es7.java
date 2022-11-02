import java.util.Scanner;

public class Lez3es7 {

	public static void main(String[] args) {

		Scanner tasti = new Scanner(System.in);

		System.out.println("Inserisci 3 numeri");
		int numero1 = tasti.nextInt();
		int numero2 = tasti.nextInt();
		int numero3 = tasti.nextInt();

		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("Il numero più grande è " + numero1);
		} else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("Il numero più grande è " + numero2);
		} else if (numero3 >= numero1 && numero3 >= numero2)
			System.out.println("Il numero più grande è " + numero3);
	
		tasti.close();
	}
}
