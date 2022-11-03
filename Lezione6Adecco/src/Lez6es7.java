import java.util.Scanner;
import java.util.Random;

public class Lez6es7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Benvento alla Roulette hai 100€");

		int cash = 100;
		boolean isGameOn = true;
		
		while (isGameOn) {
			System.out.println("Quanto vuoi giocare?");
			
			int puntata = in.nextInt();
			
			while(puntata>cash) {
				System.out.println("Non hai abbastanza soldi");
				puntata = in.nextInt();	
				}
			System.out.println("Scegli la puntata fra 0 e 36");
			int numeroGiocato = in.nextInt();
			
			while(numeroGiocato<0 || numeroGiocato>36) {
				numeroGiocato = in.nextInt();
			}
			int numeroEstratto = random.nextInt(0,36);
			System.out.println("E'uscito il numero "+numeroEstratto);
			if (numeroEstratto==numeroGiocato) {
				cash+= puntata*36;
				
				System.out.println("Hai vinto ☺, ora hai "+cash+"€");
			}
			else 
				cash-= puntata;
				System.out.println("Hai perso ! Sono rimasti "+cash+"€");
						
			
		}
		System.out.println("Vuoi giocare (yes - no");
		isGameOn=in.nextLine().equals("yes") ? true : false;
		
		if (cash<=0) {
			System.out.println("Non hai più soldi, vai aprelevare, barbone");
		}		
		
		in.close();
	}

}
