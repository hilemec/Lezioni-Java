
public class StarterSword {

	public static void main(String[] args) {
		Sword spadaFuoco = new Sword();
		System.out.println(spadaFuoco);
		
		Sword spadone = new Sword("spadone");
		System.out.println(spadone);
		
		Mago mago2 = new Mago("Ciro", 500, new Sword("spadone"));
		System.out.println(mago2);

	}

}
