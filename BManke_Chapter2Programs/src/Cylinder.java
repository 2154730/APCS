import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		// A = 2pirh + 2pir^2
		// V = pir^2+h
		
		final double PI = 3.141592654;
		
		Scanner scan = new Scanner(System.in);
	try{
		System.out.println("Please enter the Radius: ");
		double radius = scan.nextDouble();
		
		System.out.println("Please enter the Height: ");
		double height = scan.nextDouble();
		
		double surfaceArea = ((2 * PI * radius * height) + (2 * PI * Math.pow(radius, 2)));
		double volume = (PI * Math.pow(radius, 2) * (height));
		
		System.out.printf("The Surface Area of the cylinder is " + "%.2f" + ". \n", surfaceArea); //number format %.nf 
		System.out.printf("The Volume of the cylinder is " + "%.2f" + ".", volume);				// where n is decimal places

		scan.close();
		} catch(Exception e){
			System.err.println("Invalid input, please try again.");
		}
	}
}
