
public class Lez11es2 {
	public int maggiori(int vettore[], int numero) {
		int maggioriVettore = 0;
		for (int i : vettore) {
			if (vettore[i]>numero)
				maggioriVettore++;			
		}
		return maggioriVettore;
	}
}
