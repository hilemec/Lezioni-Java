import java.util.Scanner;

public class Lez6es2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numeroInserito = 0;
		boolean sonoTuttiMultipli3 = true;
		do {
			System.out.println("inserisci un numero");
			numeroInserito= in.nextInt();
			if (numeroInserito%3!=0 && numeroInserito<=20 )
				sonoTuttiMultipli3= false;				
			}
		while (numeroInserito<=20);
		
		if(sonoTuttiMultipli3)
			System.out.println("Hai inserito tutti multipli di 3");
		else
			System.err.println("Non hai inserito multipli di 3");
			
		in.close();

	}

}
