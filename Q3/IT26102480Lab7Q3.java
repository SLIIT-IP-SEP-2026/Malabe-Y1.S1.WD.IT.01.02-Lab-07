import java.util.Scanner;
public class  IT26102480Lab7Q3{
	public static void main(String[]args){
		
		final double DISCOUNT_RATE=0.05;
		final int NO_OF_CUSTOMER=5;
		
		int customercount;
		double billAmount , finalBillAmount , discount=0;
		char payType;
		
		Scanner input = new Scanner (System.in);
		
		for( customercount=1 ; customercount<= NO_OF_CUSTOMER ; customercount++){
			
			System.out.println("Customer"+ customercount);
			
			System.out.print("Enter Total bill amount : ");
			billAmount= input.nextDouble();
			
			System.out.print("Enter mode of payment ( C for cash , O for others) : ");
			payType= input.next().toUpperCase().charAt(0);
			
			if ( payType == 'C'){
				discount = billAmount*DISCOUNT_RATE;
				System.out.println("Discount is : "+discount);
				
			}
			else if ( payType == 'O'){
				discount = 0;
				System.out.println("No discount applicable");
				
			}
			else {
				System.out.println("Payment Mode is NOt valid");
				System.out.println( );
				
				continue;
				
				
			}
			
			finalBillAmount = billAmount - discount;
			System.out.println("Amount to be paid : "+ finalBillAmount);
			System.out.println();
			
			
		}	
		
	}
}	