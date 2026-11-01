import java.util.Scanner;

    public class IT26102636Lab7Q1A{
		public static void main(String[]args){
			
			double mark1,mark2,mark3,mark4,avg;
			String  grade;
			
		Scanner input=new Scanner(System.in);
	    
		System.out.println("Enter  Mark for four subject: ");
		
		System.out.print("Enter Subject Mark 1: ");
		mark1=input. nextDouble();
		
		System.out.print("Enter Subject Mark 2: ");
		mark2=input. nextDouble();
		
		System.out.print("Enter Subject Mark 3: ");
		mark3=input.  nextDouble();
		
		System.out.print("Enter Subject Mark 4: ");
		mark4=input. nextDouble();
		
		//Calculate Average
		avg=(mark1+mark2+mark3+mark4)/4.0;
		
		if(avg >= 75){
			grade="Distintion";
	
		}else if(avg>=50){
			grade="Credit";
		}else{
			grade ="Fail";
		}
		System.out.println();
		System.out.println("Average is: "+avg);
		System.out.println("overall Grade is : "+grade);
			
		}
	}