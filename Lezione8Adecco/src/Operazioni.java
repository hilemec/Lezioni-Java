
public class Operazioni {
	public int somma(int num1, int num2) {
		int somma = num1 + num2 ;
		return somma;
	}
	public int radd(int num) {
		return num*2;
	}
	public int calcolaCaratteri( String parola) {
		return parola.length();
	}
	public int maggiore(int num1, int num2) {
		// reurn num1>num2 ? num1 : num2
		if(num1>num2) return num1;
		else return num2;
	}
	public int lanciaDado() {
		Random random = new Random();
		int numeroGenerato = random.nextInt(6)+1;
		return numeroGenerato;
	}
	public String ripetiParola(String parola, int numeroVolte) {
		String ris = "";
		for (int i = 0; i < numeroVolte; i++)
								ris += parola;
		return ris;			
	}

}
