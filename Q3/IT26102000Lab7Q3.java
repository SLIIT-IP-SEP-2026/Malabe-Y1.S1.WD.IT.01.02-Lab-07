import java.util.Scanner;

public class IT26102000Lab7Q3{
	
	public static void main(String[] args){
		
		char paymentMode;
		int customer;
		double bill, finalAmount, discount;
		
		Scanner input = new Scanner(System.in);
		
		for(customer = 1; customer <=5; customer++){
			
			System.out.println("Customer " + customer);
			
			System.out.print("Enter bill amount = ");
			bill = input.nextDouble();
			
			System.out.print("Enter mode of payment(C for cash, O for other): ");
			paymentMode = input.next().toUpperCase().charAt(0);
			
			if(paymentMode == 'C'){
				
				discount = bill * 0.05;
				finalAmount = bill - discount;
				System.out.println("Discount is: " + discount);
				System.out.println("Amount to be paid : " + finalAmount);
				
			}
			
			else if(paymentMode == 'O'){
				
				System.out.println("No discount applicable.");
				System.out.println("Amount to be paid : " + bill);
				
			}
			
			else{
				
		        System.out.println("Payment mode isn't valid.");
	
			}
			
			System.out.println();
			
		}
		
	}
}
