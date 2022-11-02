import java.util.Scanner;
public class Esercizio7 {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		
		int numero1 = tastiera.nextInt();
		
		tastiera.close();
		
		System.out.println("numero---> "+numero1);
	}

}
