import java.util.Scanner;
public class StarterOperazioni2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Operazioni2 op2 = new Operazioni2();
		
		boolean loopOn = true;
		do {
			System.out.println("Inserisci un numero");
			int numeroUtente = in.nextInt();
			
			if(op2.isPari(numeroUtente))
				System.out.println("Numero pari");
			else
				System.out.println("Numero Dispari");
			
			System.out.println("Digita y e invio per continuare");
			loopOn = in.next().equals("y") ? true : false;
			
		} while (loopOn);
		
		in.close();

	}

}
