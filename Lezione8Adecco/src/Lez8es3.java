import java.util.Scanner;
public class Lez8es3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] vettore = { 21, -67, 10, 76, -2, 88, 0 };
		boolean presenza=true;
		
		System.out.println("Inserisci un numero: ");
		int numero = in.nextInt();
		
		for (int i = 0; i < vettore.length; i++) {
			if (vettore[i]==numero) {
				System.out.println("\nIl numero inserito è presente nel vettore");
				break;
			}
			else numero = in.nextInt();			
		}			
		in.close();
	}
}
