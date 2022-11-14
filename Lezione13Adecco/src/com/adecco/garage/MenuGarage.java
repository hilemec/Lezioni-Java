package com.adecco.garage;
import java.util.Scanner;
import com.adecco.veicoli.*;

public class MenuGarage {

	private Garage boxAuto;
	private Scanner in;
	
	public MenuGarage(int posti) {
		boxAuto = new Garage(posti);
		in = new Scanner(System.in);
	}
	public void stampaMenu() {
		System.out.println("Inserisci 1 per parcheggiare \n"+
									  "Inserisci 2 per prelevare \n"+
									  "Inserisci 3 per stampare \n" +
									  "Inserisci un altro numero per uscire.");
		}
	public void start() {
		boolean isWorking = true;
		do {
			stampaMenu();
			int input = in.nextInt();
			
			switch (input) {
			case 1:
				inserisci();
				break;
			case 2:
				remove();
				break;
			case 3:
				stampa();
				break;
			default:
				isWorking = false;
				break;
			}		
		} while (isWorking);		
		in.close();
	}	
	public void remove() {
		System.out.println("Inserisci la posizione da rimuovere");
		int posizioneDaEliminare = in.nextInt();
		System.out.println("Rimuovo---> "+
						boxAuto.estraiVeicolo(posizioneDaEliminare)	);
	}
	public void stampa() {
		boxAuto.stampaPosti();
	}
	public void inserisci() {
		System.out.println("OK parcheggio:\n"+
										"1 per un'automobile"+
										"2 per un furgone"+
										"3 per una motocicletta");
										
										int sceltaUtente = in.nextInt();
										
										switch (sceltaUtente) {
										case 1:
											boxAuto.immettiNuovoVeicolo(new Automobile());
											break;
										case 2:
											boxAuto.immettiNuovoVeicolo(new Furgone());    
											break;
										case 3:
											boxAuto.immettiNuovoVeicolo(new Motocicletta());    
											break;
										default:
											break;
										}
	}
	

}
