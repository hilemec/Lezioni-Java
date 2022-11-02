import java.util.Scanner;

public class Lez3_es5 {

	public static void main(String[] args) {
		Scanner tasti = new Scanner(System.in);
		
		System.out.println("insert");
		int numero1 = tasti.nextInt();
		int numero2 = tasti.nextInt();
		
		String divisore = numero1%numero2==0 ? "divisore" : "non divisore";
		System.out.println(divisore);
		
		if (numero1%numero2==0) {
			System.out.println("DIVISORE");
		}
		else System.out.println("NON DIVISORE");
		
		tasti.close();
	}
}