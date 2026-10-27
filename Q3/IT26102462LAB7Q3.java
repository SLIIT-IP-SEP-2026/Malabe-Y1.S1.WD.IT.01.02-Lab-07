import java.util.Scanner;
public class IT26102462LAB7Q3{
    public static void main (String []args){

     Scanner input = new Scanner(System.in);
	 
	 final double DISCOUNT_RATE=0.05;
	 final double NO_OF_COSTOMER=5;
	 
	 double billAmount, Amounttobepaid;
	 char paymentMode;
	 
	  double discount =0;
	  for (int customerCount =1 ; customerCount<= NO_OF_COSTOMER; customerCount++){
		  
		  System.out.println ("customer"+ customerCount);
		  
		  System.out.println ("Enter the total bill amount : ");
		  billAmount=input.nextDouble();
		  
		  System.out.println ("Enter the Mode of payment (C for cash ,O for other ) : ");
		  paymentMode=input.next().toUpperCase().charAt(0);
		  
		  
		  if (paymentMode=='C'){
			  
			  discount=billAmount+DISCOUNT_RATE;
			  Amounttobepaid = billAmount=discount;
			  
			  System.out.println ("Discount is : "+ discount);
			  System.out.println ("Amount to be paid is :"+Amounttobepaid);
			}
			else if(paymentMode=='0')
			{
				
				Amounttobepaid = billAmount;
				
				System.out.println ("No discount Applicable");
			  System.out.println ("Amount to be paid is :"+Amounttobepaid);
				
			}
		  else {
			  System.out.println("payment mode is not valid");
		  }
		  continue;
	  }
	 
	 
	 
	


	}
}