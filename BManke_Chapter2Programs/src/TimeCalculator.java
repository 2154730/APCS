import java.util.Scanner;

public class TimeCalculator {

	public static void main(String[] args) {
		// --
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the number of minutes:");
		
		//seconds -> minutes
		//130 / 60 = 2
		//130 % 60 = 10
	
		int numberOfMinutes = scan.nextInt();
		int numberOfHours = numberOfMinutes / 60;
		int numberOfDays = numberOfHours / 24;
		int numberOfYears = numberOfDays / 365;
		
		numberOfYears %= 365;
		numberOfHours %= 24;
		numberOfMinutes %= 60;
		//SAME: numberOfSeconds = numberOfSeconds % 60;
		
		System.out.println();
		System.out.println("That is " + numberOfYears + " years and " + numberOfDays + " days and " + numberOfHours + " hours and " + numberOfMinutes + " minutes.");
	
	}

}