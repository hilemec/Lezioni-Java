
public class Lez7es4 {

	public static void main(String[] args) {
		int[] vettore = {2,4,18,9,8,6};
		boolean pari = true;
		for (int i = 0; i < vettore.length; i++) {
			if (vettore[i]%2!=0) {
				pari = false;
				break;
				}
			}
			if (pari)
				System.out.println("Il vettore contiene tutti elementi pari");
			else
				System.out.println("Il vettore non contiene tutti elementi pari");
	}

}
