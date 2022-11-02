import java.util.Scanner;

public class Lez3_es4 {

	public static void main(String[] args) {
		
		Scanner tasti = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		
		int numero = tasti.nextInt();
		
		String pari_dispari = (numero%2)!=0 ? "numero dispari" : "numero pari";
		
		System.out.println(pari_dispari);
		
		tasti.close();
		
		

	}

}
