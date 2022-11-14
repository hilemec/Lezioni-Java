package SistemaCodePersona;
import java.util.Random;
public class Starter {

	public static void main(String[] args) {
		
		Random random = new Random();
		Coda coda = new Coda();
		
		for (int i = 0; i < 10; i++) {
			coda.aggiungiPersona(new Persona("Cognome "+ 0, random.nextInt(10,70)));	
		}
		System.out.println(coda.restituisciProssimo());
		
		System.out.println("--------------------------------");
		
		coda.stampaPersone();
		

	}

}
