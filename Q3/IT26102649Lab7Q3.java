import java.util.Scanner;
	public class IT26102649Lab7Q3{
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double discountRate = 0.05 ;
		
		for(int i = 1; i<=5; i++ ){
		
    System.out.println("Customer " +i);
		System.out.print("Enter total bill: " );
		double total = input.nextDouble();
		
		System.out.print("Enter mode of payment (C for cash and O for others): ");
		char paymentMode = input.next().charAt(0);
		
		if(paymentMode == 'C' || paymentMode == 'c'){
			double discount = total*discountRate;
			double amountToBePaid = total-discount;
			
			System.out.println("Discount is : " + discount);
			System.out.println("Amount to be paid: " + amountToBePaid);
		}else if (paymentMode == 'O' || paymentMode == 'o'){
			System.out.println("No discount applicable");
			System.out.println("Amount to be paid: " +total);
		}else {
			System.out.println("Payment mode is not valid");
		}
		System.out.println();
		}
	}
}