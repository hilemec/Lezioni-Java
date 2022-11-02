import java.util.Scanner;

public class Lez3_es9 {

	public static void main(String[] args) {
		Scanner tasti = new Scanner(System.in);

		System.out.println("Metti tre numeri");
		int num1 = tasti.nextInt();
		int num2 = tasti.nextInt();
		int num3 = tasti.nextInt();
		if (num2 <= num3 & num2 >= num1)
			System.out.println("il numero è compreso");
		else
			System.out.println("il numero non è compreso");
		tasti.close();

	}

}
