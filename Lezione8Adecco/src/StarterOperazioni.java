
public class StarterOperazioni {

	public static void main(String[] args) {
		Operazioni op = new Operazioni();
		
		String parolaRipetuta = op.ripetiParola("Ciao", 3);
		
		System.out.println(parolaRipetuta);
		
		System.out.println("Il numero di caratteri è "+parolaRipetuta.length());

	}

}
