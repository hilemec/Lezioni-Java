import java.util.Scanner;

public class Lez4fattoriale {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("insert number");
		int numero = key.nextInt();
		double fattoriale =1;
		int index=1;
		
		if(numero>20) {
			//formula di stirling
			
			fattoriale = Math.sqrt(2 *Math.PI*numero)
						*Math.pow(numero/Math.E , numero);
			System.out.println("Fattoriale di Stirling = "+fattoriale);
		}
		else {
			while(index <= numero) {
			fattoriale *= index;
			index++;
			}
			System.out.println("Fattoriale = "+fattoriale);
		}
		

		key.close();

	}

}
