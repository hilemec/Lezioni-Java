import java.util.Scanner;

public class Lez3_es10 {

	public static void main(String[] args) {
		Scanner tasti = new Scanner(System.in);
		int index = 0;
		while (index<=100) {
			System.out.print(index+" ");
			index++;
			if(index%5==0)
				System.out.println("");
		}
		tasti.close();

	}

}
