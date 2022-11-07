
public class Lez8es2 {

	public static void main(String[] args) {
		int[] vett1 = { 12, 76, 1, 77 };
		int[] vett2 = { 2, 37, 8, 7 };
		if(vett1.length==vett2.length)
			System.out.println("I due vettori hanno la stessa dimensione");
		else
			System.out.println("I due vettori hanno dimensione differente");
		int[] vettSomma = {0,0,0,0};
		for (int i = 0; i < vett1.length; i++) {
			vettSomma[i]=vett1[i]+vett2[i];
		}
		
		System.out.println("Il nuovo vettore è così composto:\n");
		for (int j = 0; j < vettSomma.length; j++) {
			System.out.print(vettSomma[j]+" ");	
		}

	}

}
