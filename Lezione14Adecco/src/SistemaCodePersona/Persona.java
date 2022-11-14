package SistemaCodePersona;

public class Persona {
	private String cognome;
	private int eta;
	
	public Persona (String cognome, int eta) {
		setCognome(cognome);
		setEta(eta);
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}

}
