import java.util.Scanner;

public class Lez5compito5 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Inserisci un anno");
		int anno = key.nextInt();
		if(anno%400==0) System.out.println("L'anno "+anno+" è bisestile");
		else if(anno%4==0&&anno%100!=0)
			System.out.println("L'anno "+anno+" è bisestile");
		else
			System.out.println("L'anno "+anno+" non è bisestile");
		
	}

}
