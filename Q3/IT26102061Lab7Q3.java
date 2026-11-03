import java.util.Scanner;
public class IT26102061Lab7Q3{
	public static final int DISCOUNT=5;
	public static void main(String[] args){
		
		int custem=1;
		double amount,total,discount;
		
		Scanner input=new Scanner(System.in);
		
		
		do{
			System.out.print("\nCustomer "+custem);
			
			System.out.print("\nEnter total bill amount : ");
			amount=input.nextDouble(); 
			
			if(amount>0){
				
				System.out.print("Enter mode of payment (C for cash, O for other) : ");
				char mode=input.next().charAt(0);
				
				if(mode=='C'||mode=='c'){
					
					discount=amount*DISCOUNT/100;
					System.out.println("Discount is : "+discount);
					
					total=amount-discount;
					System.out.println("Amount to be paid : "+total);
				}
				else if(mode=='O'||mode=='o'){
					System.out.println("No discount applicable");
					System.out.println("Amount to be paid : "+amount);
				}
				else{
					System.out.println("Payment Mode is Not Valid");
				}
			}
			else{
				System.out.println("\n -- Enter valid Amount -- \n");
			}
				
			custem++;
				
		}while(custem<=5);
	}
}
		
		