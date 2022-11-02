import java.util.Scanner;

public class RecapLez4 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Inserisci qualcosa:");
		String word = key.nextLine();
		String vocali = "";
		int index=0;
		while(index<word.length()) {
			char carattere = word.charAt(index);
			if (carattere=='a'||
				carattere=='e'||
				carattere=='i'||
				carattere=='o'||
				carattere=='u') { 
				vocali+=carattere;
			}
			index++;
		}
		System.out.println("----solo le vocali----");
		System.out.println("   "+vocali+"");
		System.out.println("----------------------");
		

	}

}
