import java.util.Scanner;

public class Lez4formula3 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("insert numbers\n");
		int numero=key.nextInt();
		int esponente=key.nextInt();
		int numeroRisultato=1;
		while(esponente>=1) {
			numeroRisultato*=numero;
			esponente--;
		}
		System.out.println(numeroRisultato);
		key.close();
	}

}
