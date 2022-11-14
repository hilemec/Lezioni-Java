package SistemaCodePersona;

import java.util.ArrayList;

public class Coda {
	
	private ArrayList<Persona> persone;
	
	public Coda() {
		this.persone = new ArrayList<>();
	}
	public void stampaPersone() {
		for(Persona p : persone) {
			System.out.println(p);
		}
	}
	public Persona restituisciProssimo() {
		if(this.persone.isEmpty())
			return null;
		Persona temp = persone.get(0);
		persone.remove(0);
		return temp;
	}
	public void aggiungiPersona( Persona persona) {
		if(persona==null)
			return;
		this.persone.add(persona);
	}
		
	
}
