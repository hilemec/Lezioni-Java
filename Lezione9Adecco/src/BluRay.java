
public class BluRay {
	
	private String titolo;
	private double durata;
	private boolean isRatedForAnyOne;
	private String gender;
	
	//costruttore default
	public BluRay() {
		setDurata(90);
		setGender("Genere Film");
		setTitolo("Titolo del Film");
		setRate(true);
	}
	//fine costruttore default
	
	// metodo toSting
	public String toString() {
		String filmPerTutti = isRatedForAnyOne ? "Film per tutti" : "Vietato ai minori";
		return "Titolo: "+titolo+"/nDurata(minuti): "+durata+
			   "/nGenere: "+gender+"/n Classificazione: "+filmPerTutti;
	}
	
	// fine metodo toString
	
	public String getTitolo() {
		return titolo;
	}
	public double getDurata() {
		return durata;
	}
	public boolean getRated() {
		return isRatedForAnyOne;
	}
	public String getGender() {
		return gender;
	}
	public void setTitolo(String nuovoTitolo) {
		this.titolo = nuovoTitolo.length()>=2 ? nuovoTitolo : "Default Title";
	}
	public void setDurata(double nuovaDurata) {
		this.durata = nuovaDurata>0 ? nuovaDurata : -nuovaDurata;
	}
	public void setRate(boolean newRate) {
		this.isRatedForAnyOne = newRate;
	}
	public void setGender(String nuovoGender) {
		this.gender = nuovoGender.length()>=2 ? nuovoGender : "Default Gender";
	}
}
