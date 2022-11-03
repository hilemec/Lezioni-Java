import java.util.Iterator;
import java.util.Scanner;
//errato in .toString
public class Lez7es8 {

	public static void main(String[] args) {
		/* dato un vettore inizializzato
		 * { 10, 30, 5, 2, 60}
		 * e un numero in input Scanner
		 * determinare quanti numeri sono
		 * multipli del numero inserito
		 */
		int[] vettore = { 10 , 30 , 5 , 2, 60}; 
		int multipli = 0;
		String valori = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int numero = in.nextInt();
		for (int i = 0; i < vettore.length; i++) {
			if(vettore[i]%numero==0) {
				valori+=(vettore.toString(i)+" ");
				multipli++;
			}
		}
		System.out.println("Il numero inserito è multiplo\n"+
		"di "+multipli+" valori del vettore");
		System.out.println("e sono "+ valori);
		in.close();

	}

}
