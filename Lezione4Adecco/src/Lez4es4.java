import java.util.Scanner;

public class Lez4es4 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("insert word\n");
		String word = key.nextLine();
		int length = word.length();
		int index = 0;
		while(index<length) {
			if (word.charAt(index)=='a'||
				word.charAt(index)=='e'||
				word.charAt(index)=='i'||
				word.charAt(index)=='o'||
				word.charAt(index)=='u')
				System.out.print(word.charAt(index));
			index++;
			key.close();
		}

	}

}
