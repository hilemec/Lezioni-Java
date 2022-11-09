
public class Lez11es4 {
	
	public String[] paroleLunghe(String[] parole) {
	    String[] paroleMaggiori3 = new String[parole.length];
		for(int i=0, j=0 ; i<parole.length; i++) {
			if(parole[i].length()>=3)
				paroleMaggiori3[j]=parole[i];
				j++;
		}
		return paroleMaggiori3;
	}
}
