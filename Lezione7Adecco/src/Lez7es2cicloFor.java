import java.util.Scanner;
public class Lez7es2cicloFor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lunghezzaVettore;
		
		do {
			System.out.println("Inserisci grandezza vettore: ");
			lunghezzaVettore=in.nextInt();
			
		} while (lunghezzaVettore>10||lunghezzaVettore<3);
	
		int[] vettore = new int[lunghezzaVettore];
		
		System.out.println("Il vettore è composto così: ");
		
		for (int i = 0; i < vettore.length; i++) {
			int j = vettore[i];
			System.out.println(j+" ");
// inzializzazione.vettore int[] vettore = {3,4,6,8,15};
		}
		
		in.close();
	}
}
