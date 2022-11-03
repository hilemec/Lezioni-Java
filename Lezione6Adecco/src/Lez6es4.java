import java.util.Scanner;

/** 
 * Esercizio :
 * Dato una sequenza di numeri
 * che termina con 0
 * determinare se la sequenza 
 * e' alternata da un numero pari
 * seguito da un numero dispari
 * 
 * ES :    10 3 20 5 0 -----> OK
 * 
 *         10 20 30 5 10 0 -----> NO
 *         
 *         3 10 5 ---> NO
 */

public class Lez6es4 {

	public static void main(String[] args) {
				
		Scanner key = new Scanner(System.in);
			
		boolean isSequenceOk = true;
			
		System.out.println("inserire");
		int numeroUtente = key.nextInt();
		int index = 0;

		while(numeroUtente != 0 ) {
			
			//blocco 1 -- qui devo verificare:
			//			se trovo un dispari non va bene
			if(index % 2 == 0 ) {
				System.out.println("numero pari");
				
				if(numeroUtente % 2 != 0)
					isSequenceOk = false;		
				
			}else {
				//non devo trovare pari
				System.out.println("numero dispari");		
				
				if(numeroUtente % 2 == 0)
					isSequenceOk = false;	
			}	
			System.out.println("inserisci");
			numeroUtente = key.nextInt();
			
			index++;
		}
		if (isSequenceOk)
		System.out.println("La sequenza è corretta");
		else
			System.out.println("La sequenza è scorretta");
		key.close();
	}

}