import java.utill.Scanner;

public class IT26102680Lab7Q3{
	public static void main(String[] args){
		Scanner scanner=new scanner(System.in);
		
		for(int i=1;i<=5;i++){
			System.out.println("Customer"+i);
			System.out.print("Enter total bill amount:");
			double bilAmount=scanner nextDouble();
			
			System.out.print("Enter mode of payment(C for cash,O for others):" );
			char mode=scanner.next().CharAt(0);
			
			if(mode=='C'||mode=='c'){
				double discount=billAmount*0.05;
				double amountPaid=billAmoun-discount;
				System.out.println("Discount is:"+discount);
				System.out.println("Amount to be paid:"+amountPaid);
			}else if(mode=='0'||mode=='0'){
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid:"+bilAmount);
			}else{
				System.out.println("Payment Mode is Not Valid");
			}
		}
		scanner.close();
		
	}
}