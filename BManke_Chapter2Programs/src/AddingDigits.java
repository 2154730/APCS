import java.util.Scanner;

public class AddingDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
	while(run){
		System.out.println("Please enter a integer between 0 and 1000: ");
		int input = scan.nextInt();
		if(input > 1000 || input < 0){
			System.out.println("That is over 1000! or Below 0!");
			run = false;
			break;
		}
		
		int sum = 0;
		while(input > 0){
			int add = input % 10;
			sum = sum + add;
			input = input / 10;
		}
		System.out.println(sum);
	}
	}

}
