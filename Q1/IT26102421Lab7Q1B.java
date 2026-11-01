import java.util.Scanner;
public class IT26102421Lab7Q1B{
	public static void main(String[] args){
		
		String grade;
		int studentcount=1;
		double average;
		
		Scanner sc=new Scanner(System.in);
		
		while(studentcount<=3){
			System.out.println("Student "+studentcount);
			
			System.out.print("Enter marks: ");
			
			int mark1=sc.nextInt();
			int mark2=sc.nextInt();
			int mark3=sc.nextInt();
			int mark4=sc.nextInt();
			
			average=(mark1+mark2+mark3+mark4)/4.0;
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
			System.out.println();
			
			studentcount+=1;
		}
	}
}