
public class Bevanda {
	private String nome;
	private double capienza;
	private double costo;
	private boolean alcohol;
	
	public Bevanda(String nome, double capienza, double costo, boolean alcohol) {
		setNome(nome);
		setCapienza(capienza);
		setCosto(costo);
		setAlcohol(alcohol);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCapienza() {
		return capienza;
	}
	public void setCapienza(double capienza) {
		this.capienza = capienza;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public boolean isAlcohol() {
		return alcohol;
	}
	public void setAlcohol(boolean alcohol) {
		this.alcohol = alcohol;
	}
	public String toString() {
		return "Bevanda = " + nome + "\nCapienza= " + capienza + "\nCosto=" + costo + "\nAlcohol=" + alcohol;
	}
}
