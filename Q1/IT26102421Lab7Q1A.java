import java.util.Scanner;
public class IT26102421Lab7Q1A{
	public static void main(String[] args){
		
		String grade;
		
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter marks for four subjects");
			
			System.out.print("Enter Subject Mark 1: ");
			int mark1=sc.nextInt();
			
			System.out.print("Enter Subject Mark 2: ");
			int mark2=sc.nextInt();
			
			System.out.print("Enter Subject Mark 3: ");
			int mark3=sc.nextInt();
			
			System.out.print("Enter Subject Mark 4: ");
			int mark4=sc.nextInt();
			
			double average=(mark1+mark2+mark3+mark4)/4.0;
			System.out.print("Average is: "+ average);
			
			if (average>=75){
				grade="Distinction";
			}
			else if (average>=50){
				grade="Credit";
			}
			else{
				grade="Fail";
			}
			
			System.out.println();
			System.out.print("Overall grade is: "+ grade);
		
	}
}