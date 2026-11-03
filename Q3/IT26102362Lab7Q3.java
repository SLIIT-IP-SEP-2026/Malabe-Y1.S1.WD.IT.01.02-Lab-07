import java.util.Scanner;
public class IT26102362Lab7Q3{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		int count=1;
		double bill, totalBill, discount;
		char paymentMethod;
		
		while(count<6){
			System.out.println("Customer "+count);
			System.out.print("Enter total bill amount: ");
			bill = input.nextDouble();
			
			System.out.print("Enter mode of payment (C for cash, O for other): ");
			paymentMethod = input.next().charAt(0);
			
			if ((paymentMethod == 'c' || paymentMethod == 'C') || (paymentMethod == 'o' || paymentMethod == 'O')){
				if (paymentMethod == 'c' || paymentMethod == 'C'){
					discount = bill*5/100;
					totalBill = bill-discount;
					System.out.println("Discount is : "+ discount);
					System.out.println("Amount to be paid: "+totalBill+"\n");
				}
				else{
					System.out.println("No Discount applicable");
					System.out.println("Amount to be paid: "+bill+"\n");
				}
			}
			else{
				System.out.println("Payment Mode is Not Valid\n");
			}
			count++;
			
		}	
		
	}
}
