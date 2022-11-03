import java.util.Scanner;

public class Lez7es1 {
	public static void main(String[] args) {
		/* Vettori = Array
		 * tipoVettore[] nomeVettore = new tipoVettore[dimendione]
		 */
		int[] vettoreInt = new int[10];
		
		int index=0;
		vettoreInt[0] = 1;
		vettoreInt[9] = 9;
		
		while(index<vettoreInt.length) {
			System.out.println(vettoreInt[index]);
			index++;
		}

		
		
	}

}
