import java.util.Scanner;

public class IT26102421Lab7Q3 {
    public static void main(String[] args) {
		
		int no_of_customers;
		final double DISCOUNT_RATE=0.05;
		
		Scanner sc=new Scanner(System.in);
	
		
		for(no_of_customers=1; no_of_customers<=5; no_of_customers++){
			
			System.out.println("Customer"+" "+no_of_customers);
			
			System.out.print("Enter total bill amount: ");
			double amount=sc.nextDouble();
			
			System.out.print("Enter mode of payment: ");
			char mode=sc.next().toUpperCase().charAt(0);
			
			if(mode=='C'){
				double discount=DISCOUNT_RATE*amount;
				double amount_to_be_paid=amount-discount;
				
				System.out.println("Discount is: "+ discount);
				System.out.print("Amount to be paid: "+amount_to_be_paid);
			}
			else if(mode=='O'){
				System.out.println("No discount applicable");
				double amount_to_be_paid=amount;
				System.out.print("Amount to be paid: "+amount);
			}
			else{
				System.out.print("Payment mode is not valid");
				System.out.println();
				
				continue;
			}
			System.out.println();
		}
	}
}