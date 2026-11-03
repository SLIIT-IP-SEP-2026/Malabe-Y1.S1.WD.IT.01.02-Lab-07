import java.util.Scanner;
public class IT26102061Lab7Q1A{
	public static void main(String[] args){
		
		double mark=1.0,sum=0.0;
		double ave;
		int num=1;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter marks for four subjects : \n");
		
		do{
			
				
				System.out.print("Enter Subject Mark "+num+" : ");
				mark=input.nextInt();
				
				if(mark>=0&& mark<=100){
				
				sum=sum+mark;
			
				num++;
				mark++;
			}
			else{
				System.out.println("\n -- Enter valid Mark -- \n");
			}
			
		}while(num<=4);
		
		ave=sum/4;
		
		System.out.println("\nAverage is : "+ave);
		
		if(ave>=75 && ave<=100){
			System.out.println("Overall Grade is : Distinction");
		}
		else if(ave>=50 && ave<=74){
			System.out.println("Overall Grade is : Credit");
		}
		else
		{
			System.out.println("Overall Grade is : Fail");
		}
	}
}
			
		
		
		
		
		
			
			
			
		
		