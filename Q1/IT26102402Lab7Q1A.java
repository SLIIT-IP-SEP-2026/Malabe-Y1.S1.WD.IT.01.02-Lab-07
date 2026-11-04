import java.util.Scanner;
public class IT26102402Lab7Q1A{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int mark1,mark2,mark3,mark4;
		double avg;
		string grade;
			
		System.out.println("Enter marks for four subjects");
		
		System.out.println("Enter subject mark 1");
		mark1 = input.nextInt();
		
		System.out.println("Enter subject mark 2");
		mark2 = input.nextInt();
		
		System.out.println("Enter subject mark 3");
		mark3 = input.nextInt();
		
		System.out.println("Enter subject mark 4");
		mark4 = input.nextInt();
		
		//calculate the average
		avg = (mark1+mark2+mark3+mark4)/4.0;
		
		if(avg >= 75){
			grade = "Distiction";
		}else if(avg >= 50){
			grade = "Credit";
		}else{
			grade = "Fail";
		}
		
		System.out.println();
		System.out.println("Average is :" + avg);
		System.out.println("Credit : " + grade);
		
	}
}