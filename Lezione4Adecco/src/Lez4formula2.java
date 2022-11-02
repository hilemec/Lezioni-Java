import java.util.Scanner;

public class Lez4formula2 {

	public static void main(String[] args) {
		final double PEZZI_IN_SCACCHI = 32 //costante
		Scanner key = new Scanner(System.in);
		System.out.println("insert number\n");
		double numero = key.nextDouble();
		double blocco1 = Math.pow(Math.E/2,numero+1);
		double blocco2 = Math.pow(Math.PI/4,3);
		double blocco3 = 2*Math.PI;
		double blocco4 = (7*numero)/3;
		if((blocco3-blocco4)!=0) {
			double risultato = (blocco1*blocco2)/(blocco3-blocco4);
			System.out.println("Il risultato dell'espressione è:"+risultato);
		} else
			System.out.println("non posso fare il calcolo");
		key.close();
	}

}
