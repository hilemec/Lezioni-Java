public class Lez7es9 {

	public static void main(String[] args) {
		boolean[] vettBoolean = {true,false,true,true,false,true,false};
		int veri=0;
		int falsi=0;
		for (int i = 0; i < vettBoolean.length; i++) {
			if (vettBoolean[i]) veri+=1;
			else falsi+=1;
		}
		System.out.println("I valori true sono "+veri+
				           "\nquelli false invece "+falsi);
	}

}
