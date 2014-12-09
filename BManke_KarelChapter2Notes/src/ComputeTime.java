import java.util.Scanner;

public class ComputeTime {

	public static void main(String[] args) {
		// --
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the number of seconds:");
		
		//seconds -> minutes
		//130 / 60 = 2
		//130 % 60 = 10
	
		int numberOfSeconds = scan.nextInt();
		int numberOfMinutes = numberOfSeconds / 60;
		int numberOfHours = numberOfMinutes / 60;
		int numberOfDays = numberOfHours / 24;
		
		numberOfHours %= 24;
		numberOfMinutes %= 60;
		numberOfSeconds %= 60;
		//SAME: numberOfSeconds = numberOfSeconds % 60;
		
		System.out.println();
		System.out.println("This is " + numberOfDays + " days and " + numberOfHours + " hours and " + numberOfMinutes + " minutes and " + numberOfSeconds + " seconds");
		
		
		
		
		

	}

}
