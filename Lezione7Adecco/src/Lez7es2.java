import java.util.Scanner;
public class Lez7es2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lunghezzaVettore;
		
		do {
			System.out.println("Inserisci grandezza vettore: ");
			lunghezzaVettore=in.nextInt();
			
		} while (lunghezzaVettore>10||lunghezzaVettore<3);
		
		int index=0;
		int[] vettore = new int[lunghezzaVettore];
		
		while (index<vettore.length) {
			System.out.print("Inserisci il valore "+index+" : ");
			vettore[index] = in.nextInt();
			index++;			
			}
		
		int indexStampa=0;
		System.out.println("Il vettore è composto così: ");
		while (indexStampa<vettore.length) {
			System.out.print(vettore[indexStampa]+" ");
			indexStampa++;
		}
		in.close();
	}

}
