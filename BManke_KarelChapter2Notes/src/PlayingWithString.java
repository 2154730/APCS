import java.util.Scanner;
public class PlayingWithString {

	public static void main(String[] args) {
		
		//char mander = 'p';
		String name = "Muneeb".substring(0, 5);
		String word = "smells";
		String anotherWord = "flowers";
		
		//String concatenation
		String betterWord = name + " " + word + " " + anotherWord;
		System.out.println(betterWord);
		
		System.out.println("The above sentence is " + betterWord.length() 
		+ " is characters long");
		
		String billy = word + " " + 9;
		System.out.println(billy); //prints next to string
		
		System.out.println("\"Hello\n new line\t(tab)aaayyy\"");
		// ============================================================================
		
		//Scanner scan = new Scanner();
		

	}

}
