import java.util.Scanner;

public class Lez6es5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean vocaliPari = true;
			
		System.out.println("inserisci una parola");
		String parola = in.nextLine();
		int index = 0;

			while(index<parola.length()) {
				char carattereCorrente = parola.charAt(index);
				if(index%2==0) {
				if(!( carattereCorrente=='a'||
					  carattereCorrente=='e'||
					  carattereCorrente=='i'||
					  carattereCorrente=='o'||
					  carattereCorrente=='u'))
					vocaliPari = false;
					}
				index++;
				}
		if (vocaliPari)
		System.out.println("La sequenza è corretta");
		else
			System.out.println("La sequenza è scorretta");
		in.close();
	}

}