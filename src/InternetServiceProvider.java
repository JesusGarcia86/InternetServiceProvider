import java.util.Scanner;
public class InternetServiceProvider {

	public static void main(String[] args) {
		//Declare variables
		String userInputPackage;
		double PRICE_A = 9.95;
		double PRICE_B = 13.95;
		double PRICE_C = 19.95;
		int LIMIT_A = 10;
		int LIMIT_B = 20;
		double EXTRA_FEE_A = 2.00;
		double EXTRA_FEE_B = 1.00;
		int userInputHours;
		int exceededHours = 0;
		double extraCharge = 0;
		double totalBill = 0;
		
		//Create a Scanner Object
		Scanner keyboard = new Scanner(System.in);
		
		//Get the user's package
		System.out.println("Enter the letter of the package purchased: ");
		userInputPackage  = keyboard.nextLine();
		
		System.out.println("Enter the number of hours that were used: ");
		userInputHours = keyboard.nextInt();
		
		//Charges if package is A, B or C
		if( userInputPackage.equalsIgnoreCase("a")) {
			if( userInputHours > LIMIT_A) {
				exceededHours = userInputHours - LIMIT_A;
				extraCharge = exceededHours * EXTRA_FEE_A;
			}
		totalBill = PRICE_A + extraCharge;
		System.out.print("Your total charges are $" + totalBill);
		}
		else if( userInputPackage.equalsIgnoreCase("b")) {
			if( userInputHours > LIMIT_B) {
				exceededHours = userInputHours - LIMIT_B;
				extraCharge = exceededHours * EXTRA_FEE_B;
			}
		totalBill = PRICE_B + extraCharge;
		System.out.print("Your total charges are $" + totalBill);
		}
		else if( userInputPackage.equalsIgnoreCase("c")) {
			totalBill = PRICE_C;
			System.out.print("Your total charges are $" + totalBill);
		}
		else if ( userInputPackage.equalsIgnoreCase("d")) {
			System.out.print("The package input was not an option.");
		}
	}
}
