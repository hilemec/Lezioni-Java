
public class Padrone {
	private String nome;
	private int eta;
	private Gatto gatto;
	
	public Padrone(String nome, int eta, Gatto gatto) {
		this.nome = nome;
		this.eta = eta;
		this.gatto = gatto;
	}
	public Padrone(Gatto gatto) {
		this.gatto = gatto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public Gatto getGatto() {
		return gatto;
	}
	public void setGatto(Gatto gatto) {
		this.gatto = gatto;
	}
	public String toString() {
		return "Padrone:\nnome= " + nome + "\neta= " + eta;
	}
}
