import java.util.Scanner;

public class IT26102687Lab7Q3{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		for( int i=1; i<=5; i++){
			System.out.println("Customer" +i);
			
			System.out.print("Enter total bill amount:");
			double total= input.nextDouble();
			
			System.out.print("Enter mode of payment(C for cash,O for other):");
			char modeOfPayment= input.next().charAt(0);
			
			if (modeOfPayment == 'C' || modeOfPayment == 'c'){
				double discount = total * 0.05;
				double amountToPay = total - discount;
				
				System.out.println("Discount is:" +discount);
				System.out.println("Amount to be paid:" +amountToPay);
			}else if(modeOfPayment == 'O'|| modeOfPayment == 'o'){
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid:" +total);
				
			}else {
				System.out.println("Payment Mode is Not Valid");
			}
			System.out.println();
		}
		
	}
}