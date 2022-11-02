import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		// if \ Else
		
		Scanner tastiera = new Scanner(System.in);

		System.out.println("Scrivi un numero ");
		
		int numero1 = tastiera.nextInt();

		System.out.println("scrivine un altro");
		
		int numero2 = tastiera.nextInt();
		
		System.out.println("Hai scritto "+numero1+" e "+numero2);
		
		if (numero1>numero2) {
			System.out.println("\nIl numero più grande è "+numero1);
			}
		else
			System.out.println("\nIl numero più grande è "+numero2);
		
		tastiera.close();
	}

}
