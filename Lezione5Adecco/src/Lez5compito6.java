import java.util.Scanner;

public class Lez5compito6 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Inserisci il numero a");
		double a = key.nextInt();
		System.out.println("Inserisci il numero b");
		double b = key.nextInt();
		System.out.println("Inserisci il numero c");
		double c = key.nextInt();


		System.out.println("La soluzione dell'equazione ax²+ bx + c = 0 è:");
		double x1 = (-b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
		double x2 = (-b-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
		System.out.println("x1 = "+x1);
		System.out.println("x2 = "+x2);
		key.close();
	}

}
