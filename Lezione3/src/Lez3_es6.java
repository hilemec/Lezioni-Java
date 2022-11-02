import java.util.Scanner;

public class Lez3_es6 {

	public static void main(String[] args) {
		Scanner tasti = new Scanner(System.in);
		System.out.println("insert 3 number");
		int numero1 = tasti.nextInt();
		int numero2 = tasti.nextInt();
		int numero3 = tasti.nextInt();
		
		if (numero1%5==0&&numero2%5==0&&numero3%5==0) {
			System.out.println("Sono tutti divisori di 5");
			}
		else {
			System.out.println("Non sono tutti divisori di 5");
		}
		
		String divisore = numero1%5==0&&numero2%5==0&&numero3%5==0 ? "SONO TUTTI DIVISORI 5" : 
			"NON SONO TUTTI DIVISORI 5";
		System.out.println(divisore);
		tasti.close();
	}

}
