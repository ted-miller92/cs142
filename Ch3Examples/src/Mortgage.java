// this program prompts for information aobut a loan and
// computes the monthly mortage payment

import java.util.*; // imports scanner

public class Mortgage {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		// obtain values
		System.out.println("This program computes monthly " + "mortgage payments");
		System.out.print("lona amount:  " );
		double loan = console.nextDouble();
		
		System.out.print("number of years: ");
		int years = console.nextInt();
		
		System.out.print("interest rate: ");
		double rate = console.nextDouble();
		
		System.out.println();
		
		// compute and report
		int n = 12 * years;
		
		double c = rate / 12.0 / 100;
		
		double payment = loan * c * Math.pow(1 + c,  n) / 
						(Math.pow(1 + c,  n) -1);
		
		System.out.println("Payment = $" +  (int) payment);
	}
}
