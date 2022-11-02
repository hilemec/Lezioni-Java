import java.util.Scanner;

public class Lez4es1 {

	public static void main(String[] args) {
		
		Scanner tasti = new Scanner(System.in);
		
		int index = 40;
		
//		while(numero<=60) {
//			System.out.print(numero+" ");
//			numero+=2;		
//		}
		
		while (index<=60) {
			String riString = index % 2 == 0 ? Integer.toString(index) : " ";
			System.out.print(riString);
			index++;
			
		}
		tasti.close();
	}

}
