public class Mago {
	private String nome;
	private int puntiVita;
	private boolean isAlive;
	
	private Sword spada;
	
	public Sword getSpada() {
		return spada;
	}
	public void setSpada(Sword spada) {
		if(spada!=null)
			this.spada = spada;
		else
			this.spada = new Sword();
	}
	public String getNome() {
		return nome;
	}
	public int getPuntiVita() {
		return puntiVita;
	}
	public boolean getAlive() {
		return isAlive;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPuntiVita(int puntiVita) {
		this.puntiVita = puntiVita;
		if(this.puntiVita<=0)
			this.isAlive = false;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public Mago() {
		setNome("GG Mago");
		setPuntiVita(100);
		setAlive(true);
		setSpada(new Sword());
	}
	public Mago(String nome,int puntiVita,Sword sword) {
		setNome(nome);
		setAlive(true);
		setPuntiVita(100);
		setSpada(sword);
	}
	public String toString() {
		
		String statoSalute = isAlive ? "vivo" : "morto";
		return  "Nome: " + this.nome + 
				"\nPunti Vita: " + this.puntiVita + " "+
				statoSalute +" "+" Arma: " + this.spada;
	}
	
}
