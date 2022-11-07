/**
 * 
 *  1-Funzione
 *  Creare una funzione che prenda
 *  in input un numero e resituisca
 *  true o false se il numero e' pari
 *  restituisce true altrimenti false.
 *  
 *  
 *  2-Funzione.
 *  Creare una funzione che prenda
 *  in input una Stringa e ritorna
 *  true se la stringa inizia
 *  con una vocale altrimenti false.
 * 
 * @author mr
 *
 */

public class Operazioni2 {
	public boolean isPari(int num) {
		return num%2==0;
	}
	public boolean isStartWithVowel( String parola) {
		if (parola.charAt(0)=='a'||
			parola.charAt(0)=='e'||
			parola.charAt(0)=='i'||
			parola.charAt(0)=='o'||
			parola.charAt(0)=='u') return true;
		else return false;
		// o semplicemente return false;
	}

}