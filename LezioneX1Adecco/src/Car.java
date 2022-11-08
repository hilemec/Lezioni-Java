import java.util.Random;

public class Car {
	private int cilindrata;
	private String targa;
	
	
	public Car(int cilindrata, String targa) {
		setCilindrata(cilindrata);
		setTarga( generaTarga() );
	}
	public Car() {
		setCilindrata(cilindrata);
		setTarga( generaTarga() );
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	public String generaTarga() {
		Random random = new Random();
		String[] alphastrings = {"a","b","c","d","1","2","3","4"};
		String ris ="";
		for (int i = 0; i < 10; i++) {
			ris += alphastrings[random.nextInt(alphastrings.length)];
		}
		return ris;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public String toString() {
		return "Car Cilindrata= " + cilindrata + " , Targa= " + targa;
	}	
	

}
