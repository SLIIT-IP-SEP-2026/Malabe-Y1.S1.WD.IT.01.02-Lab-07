import java.util.Scanner;

   public class IT26101754Lab7Q3 {
   
      public static void main(String[] args) {
	  
	final double DISCOUNT_RATE = 0.05;
	final int NO_OF_CUSTOMERS = 5;
	  
	double billAmount,Amounttobepaid;
    double discount = 0;
	char paymentMode;
	
	Scanner sc = new Scanner(System.in);

    for(int customercount =1 ; customercount <= NO_OF_CUSTOMERS; customercount++){
	System.out.println("customer " + customercount );
	
	System.out.print("Enter total bill amount : " );
	billAmount = sc.nextDouble();
	
	System.out.print("Enter mode of payment (C for cash, 0 for other) : " );
	paymentMode = sc.next().toUpperCase().charAt(0);
	
	if(paymentMode == 'C'){
	
	    discount = billAmount*DISCOUNT_RATE;
		Amounttobepaid = billAmount - discount;
		
		System.out.println("Discount is : " + discount);
		System.out.println("Amount to be paid : " + Amounttobepaid);
		
	} else if(paymentMode == '0'){

           Amounttobepaid = billAmount;

        System.out.println("No discount applicable");
        System.out.println("Amount to be paid : " + Amounttobepaid);

    } else {
        System.out.println("payment Mode is Not valid");
   
    }
  }

  System.out.println();
  }
  
}  
        		
	