import java.util.Scanner;

public class Lez3_Es1 {

	public static void main(String[] args) {
		
			Scanner tasti = new Scanner(System.in);
			System.out.println("Ciao, quanti anni hai");
			int eta = tasti.nextInt();
			
			if (eta<18) {
				System.out.println("Nuon puoi prendere la patente!"+
								   "\nPotrai fra "+(18-eta)+" anni");
			}
			else System.out.println("Se non hai la patente puoi andare a farla da "+
									(eta-18)+" anni");
			
			tasti.close();
			}

}
