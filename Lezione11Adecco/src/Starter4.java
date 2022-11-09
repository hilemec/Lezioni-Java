
public class Starter4 {

	public static void main(String[] args) {
		
		Lez11es4 esercizio4 = new Lez11es4();
		
		String[] vettoreStringhe = { "Dio", "Ciro", "Al", "Jhon", "Liu", "Ju" };
		
		String[] vettoreFinale = esercizio4.paroleLunghe(vettoreStringhe);
		
		System.out.println("I nomi di almeno 3 lettere sono:");
		for(String eString : vettoreFinale) {
			if(eString!=null)
				System.out.print(eString+" ");
		}

	}

}
