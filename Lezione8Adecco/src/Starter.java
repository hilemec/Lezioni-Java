import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il nome");
		persona1.nome = in.nextLine();
		
		System.out.println("Inserisci l'età");
		persona1.eta = in.nextInt();
		
		System.out.println(persona1.nome+" è una Persona ed ha "+persona1.eta+" anni.");
		System.out.println();
		
		Cane cane = new Cane();
		
		cane.bark();
		
		in.close();
	}

}
