// esempio con attributi private e uso dei metodi di get & set
public class Persona {
	
	private String nome;
	private int    eta;
	
	public String getNome() {
		return nome;
	}
	public int getEta() {
		return eta;
	}
	public void setNome(String nuovoNome) {
		nome = nuovoNome.length()>=2 ? nuovoNome : "Default Name";
	}
	public void setEta(int nuovaEta) {
		eta = nuovaEta>0 ? nuovaEta : -nuovaEta;
	}
	public void salutami() {
		System.out.println("Ciao mi chiamo " + nome + " e ho " + eta + " anni.");
	}
}
