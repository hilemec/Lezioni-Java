import java.util.Scanner;

public class Esercizio8 {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.print("Inserisci il primo numero: ");
				double numero1 = tastiera.nextDouble();
				
		System.out.print("Inserisci il secondo numero: ");
				double numero2 = tastiera.nextDouble();
		
		System.out.print("Inserisci il terzo numero: ");
				double numero3 = tastiera.nextDouble();
		
		double prodotto = (numero1*numero2*numero3);
				
		System.out.println("Il prodotto dei tre numeri è: "+prodotto);
		
		tastiera.close();

	}

}
