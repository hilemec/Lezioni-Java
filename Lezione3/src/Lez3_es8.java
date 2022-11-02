import java.util.Scanner;

public class Lez3_es8 {

	public static void main(String[] args) {
		Scanner tasti = new Scanner(System.in);
		
		System.out.println("Che voto hai preso");
		double voto = tasti.nextDouble();
		if (voto>=6) {
			System.out.println("Sei stato sufficiente");
		} else
			{
			if (voto>=4) {
				System.out.println("Insufficiente");
				
			} else
				System.out.println("Gravemente insufficiente");
			}
		
		tasti.close();
	}

}
