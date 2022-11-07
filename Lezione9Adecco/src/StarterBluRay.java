import java.util.Scanner;

public class StarterBluRay {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		BluRay nuovoBluRay = new BluRay();
		
		System.out.println("Titolo: "+nuovoBluRay.getTitolo()+"");
		System.out.println("Durata: "+nuovoBluRay.getDurata()+"");
		System.out.println("Is Rated for Anyone: "+nuovoBluRay.getRated()+"");
		System.out.println("Genere: "+nuovoBluRay.getGender()+"");
		System.out.println("------------------");
		
		
		nuovoBluRay.setTitolo(in.next());
		nuovoBluRay.setDurata(in.nextDouble());
		nuovoBluRay.setRate(in.nextBoolean());
		nuovoBluRay.setGender(in.next());
		
		System.out.println("Titolo: "+nuovoBluRay.getTitolo());
		System.out.println("Durata: "+nuovoBluRay.getDurata());
		System.out.println("Is Rated for Anyone: "+nuovoBluRay.getRated());
		System.out.println("Genere: "+nuovoBluRay.getGender());
		

	}

}
