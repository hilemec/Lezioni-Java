import java.util.Scanner;

public class StarterGattoPadrone {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il nome: ");
		String nome = in.next();
		System.out.println("Inserisci l'età");
		int eta = in.nextInt();
		
		Padrone padrone = new Padrone ( nome, eta, new Gatto());
		
		System.out.println(padrone);
		
		System.out.println("Età Gatto: "+padrone.getGatto().etaDaGattoAumano());
		
		in.close();
	}

}
