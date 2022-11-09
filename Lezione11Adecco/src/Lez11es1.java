import java.util.Iterator;

public class Lez11es1 {
	
	public int contaElementiDispari(int[] elementi) {
		int dispari=0;
		for(int i : elementi) {
			if( i%2 != 0 )
				dispari++;	
		}
		return dispari;
	}

}
