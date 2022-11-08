
public class Persona {
	private String nome;
	private int eta;
	private Car car;
	
	public Persona() {
		setNome("mario");
		setEta(24);
		setCar(new Car());
	}
	public Persona(String nome, int eta, Car car) {
		setNome(nome);
		setEta(eta);
		setCar(car);
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

	public String toString() {
		return "Persona:\nNome=" + nome + "\nEta=" + eta;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}	
	

}
