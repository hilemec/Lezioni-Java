import java.util.Scanner;
import java.util.Random;
public class Lez6es6 {

	public static void main(String[] args) {

		Random random = new Random();
		int dado1 = random.nextInt(1, 7);
		int dado2 = random.nextInt(1, 7);
		
		if((dado1+dado2)==7)
			System.out.println("Hai vinto sono usciti "+dado1+" e "+dado2);
		else
			System.out.println("Hai perso sono usciti "+dado1+" e "+dado2);
		/*
		Random random = new Random();
		
		int genera = random.nextInt(6)+1;
		
		int genera2 = random.nextInt(1, 7);
		
		System.out.println(genera);
		System.out.println(genera2);
		*/

	}

}
