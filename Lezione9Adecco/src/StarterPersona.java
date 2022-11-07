
public class StarterPersona {

	public static void main(String[] args) {
		Persona persona = new Persona();
		
		System.out.println("Nome: "+persona.getNome()+"\n");
		System.out.println("Eta': "+persona.getEta()+"\n");
		System.out.println("------------------");
		
		persona.setNome("Mario");
		persona.setEta(18);
		
		System.out.println("Nome: "+persona.getNome()+"\n");
		System.out.println("Eta': "+persona.getEta()+"\n");
		

	}

}
