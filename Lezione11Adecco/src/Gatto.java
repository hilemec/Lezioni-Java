
public class Gatto {
	private String nome;
	private String colore;
	private int eta;
	
	public Gatto(String nome, String colore, int eta) {
		setNome(nome);
		setColore(colore);
		setEta(eta);
	}
	public Gatto() {
		/*
		 * setNome("Gatto");
		 * setColore("Nero");
		 * setEta(66)
		 */	
		this("gatto","nero",1);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String toString() {
		return "Gatto\nnome=" + nome + "\ncolore=" + colore + "\neta=" + eta;
	}
	public int etaDaGattoAumano() {
		return this.eta *= 7;		
	}
}