
public class Lez11es3 {
	public int quantiDivisori(int numero) {
		int divisori=0;
		for(int i=1; i<=numero/2; i++) {
			if(numero%i==0)
				System.out.println("Divisore"+i);
				divisori++;
		}
		return ++divisori;
	}

}
