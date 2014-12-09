import java.util.Scanner;

public class LoanPayments {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		
		try{
		System.out.print("Enter the loan amount: ");
		double loanAmount = scan.nextDouble();
		
		System.out.print("Enter the Monthly Interest Rate: ");
		double annualInterestRate = scan.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 12; 
		
		System.out.print("Please enter the years: ");
		int numberOfYears = scan.nextInt();
		
		double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / (Math.pow(1 + monthlyInterestRate, (numberOfYears*12)))));
		
		double totalPayment = (monthlyPayment * numberOfYears * 12);
		
		System.out.println("Your monthly payment is " + 
				(int)(monthlyPayment * 100 + 0.5) / 100.0
				+ " and your total payment is " 
				+ (int)(totalPayment * 100 + 0.5) / 100.0);
		
		} catch(Exception e){
			System.err.println("Incorrect input.");
			 
			
		}
	}		

}
