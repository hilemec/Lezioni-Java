
public class Lez7es7 {

	public static void main(String[] args) {
		/* dato un vettore già inzializzato
		 * sommare solamente quelli in posizione
		 * pari es. vett = {11,3,16,29}
		 * 					0, 1, 2, 3
		 */
	int somma = 0;
	int[] vettore = { 10 ,60 , 55, 10 };

	for (int i = 0; i < vettore.length; i+=2) {
		somma+=vettore[i];	
	}
	System.out.println("La somma dei pari è "+somma);

	}

}
