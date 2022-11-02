import java.util.Scanner;

public class Lez4es2 {

	public static void main(String[] args) {
		
		Scanner tasti = new Scanner(System.in);
		
		System.out.println("insert 2 numbers");
		
		int numeroBasso = tasti.nextInt();
		
		int numeroAlto = tasti.nextInt();
		
		System.out.println(numeroBasso+" "+numeroAlto);
		
		while (numeroBasso<=numeroAlto) {
			System.out.print(numeroBasso+" ");
			numeroBasso++;
			
			}
		tasti.close();

	}

}
