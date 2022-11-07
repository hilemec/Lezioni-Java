
public class Lez8es0 {

	public static void main(String[] args) {
		String[] vettString = {"ciao","ala","cibo","tanto","poco","a"};
		int conta = 0;
		
		for (int i = 0; i < vettString.length; i++) {
			
			String tempString = vettString[i];
			
			if(tempString.charAt(0)=='a')
				conta++;		
		}
		
		System.out.println("Numero parole che iniziano con 'a' = "+conta);		

	}

}
