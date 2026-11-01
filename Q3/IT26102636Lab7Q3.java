import java.util.Scanner;

public class IT26102636Lab7Q3 {
    public static void main(String[] args) {
		
		final double DISCOUNT_RATE = 0.05;
		final int NO_OF_CUSTOMERS=5;
		
		double billAmount,AmounttobePaid;
		char paymentMode;
		
		double discount=0;
		
        Scanner input = new Scanner(System.in);
        
		
        for (int customerCount = 1; customerCount <= NO_OF_CUSTOMERS; customerCount++) {
            System.out.println("Customer " + customerCount);
			
            System.out.print("Enter total bill amount: ");
            billAmount = input.nextDouble();
            
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymentMode= input.next().toUpperCase().charAt(0);
            
            if (paymentMode == 'C' ) {
                 discount = billAmount *DISCOUNT_RATE;
                 AmounttobePaid = billAmount - discount;
				 
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " +AmounttobePaid);
            } else if (paymentMode == 'O' ) {
				
				AmounttobePaid = billAmount;
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " +AmounttobePaid);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
			continue;//skip to the next customer
        }
        
        System.out.println();
    }
}