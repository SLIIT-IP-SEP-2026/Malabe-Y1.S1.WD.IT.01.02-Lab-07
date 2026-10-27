import java.util.Scanner;
public class IT26102477Lab7Q3{
     public static void main (String [] args){
	 
	 final double DISCOUNT_RATE = 0.05;
	 final int NO_OF_CUSTOMERS = 5;
	 
	 double billAmount, Amounttobepaid;
	 char paymentMode;
	 
	 double discount = 0;
	 
	 Scanner input = new Scanner(System.in);
	 
	 for(int customerCount = 1; customerCount <= NO_OF_CUSTOMERS ; customerCount++ ) {
	 System.out.println("Customer" + customerCount);
	 
	 System.out.print("Enter the total bill amount :" );
	 billAmount = input.nextDouble();
	 
	 System.out.print("Enter the mode of payment (C for Cash , O for other) :" );
	 paymentMode = input.next().toUpperCase().charAt(0);
	 
	 if(paymentMode == 'C') {
	  
	  discount = billAmount * DISCOUNT_RATE;
	  Amounttobepaid = billAmount - discount;
	  
	  System.out.println("Discount is : " + discount);
	  System.out.println("Amount to be paid : " + Amounttobepaid);
	 
	 }
	 else if (paymentMode == 'O') {
		 Amounttobepaid = billAmount;
		 
		 System.out.println("No Discount Applicable");
		 System.out.println("Amount to be paid : " + Amounttobepaid);
	 }
	 else {
		 System.out.println("Payment mode is not vaild");
	 }
	 continue;
	 }
	 System.out.println();
	 
	 }
	 }