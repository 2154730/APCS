import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		final int HIGHEST_SCORE = 100;	
		boolean run = true;
try{	
	while(run){
		System.out.println("Please enter the score of Test 1: ");
		float test1 = scan.nextFloat();
		if(test1 > HIGHEST_SCORE){
			System.out.println("You must enter a score lower than 100!");
			run = false;
			break;
		}
		
		System.out.println("Please enter the score of test 2: ");
		float test2 = scan.nextFloat();
		if(test2 > HIGHEST_SCORE){
			System.out.println("You must enter a score lower than 100!");
			run = false;
			break;
		}
		
		
		System.out.println("Please enter the score of test 3: ");
		float test3 = scan.nextFloat();
		if(test2 > HIGHEST_SCORE){
			System.out.println("You must enter a score lower than 100!");
			run = false;
			break;
		}
		
		System.out.println("Please enter the score of test 4: ");
		float test4 = scan.nextFloat();
		if(test2 > HIGHEST_SCORE){
			System.out.println("You must enter a score lower than 100!");
			run = false;
			break;
		}
		
		System.out.println("Please enter the score of test 5: ");
		float test5 = scan.nextFloat();
		if(test2 > HIGHEST_SCORE){
			System.out.println("You must enter a score lower than 100!");
			run = false;
			break;
		}
		
		float testAverage = ((test1 + test2 + test3 + test4 + test5) / 5);
		
		System.out.println("Your test average is: " + testAverage + ".");
		}
		scan.close();
	
	} catch(Exception e) {
		System.err.println("Invalid input, please try again.");
		}

	}
}
