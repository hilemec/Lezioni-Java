import java.util.Scanner;
/*
 * si prenda una stringa con scanner e
 * ritorna il numero di vocali della stessa
 * 
 */
public class Lez5es1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Inserisci qualcosa:");
		String word = key.nextLine();
		int vocali = 0;
		int index=0;
		int lettere = 0;
		while(index<word.length()) {
			char carattere = word.charAt(index);
			if (carattere=='a'||
				carattere=='e'||
				carattere=='i'||
				carattere=='o'||
				carattere=='u') { 
				vocali++;
			}
			index++;
			lettere++;
		}
		System.out.println("------------------------------------");
		System.out.println("Quello che hai digitato ha "+vocali+" vocali");
		System.out.println("  e complessivamente "+lettere+" caratteri");
		System.out.println("------------------------------------");
		key.close();
	}
}
