import java.util.Scanner;
public class IT26102402Lab7Q1B{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int mark1,mark2,mark3,mark4;
		double avg;
		String grade;
		int i = 1;
		
		for(i = 1; i <= 3; i++){
			System.out.print("Enter marks for student " + i + ": ");
			
			//Input marks
			mark1 = input.nextInt();
			mark2 = input.nextInt();
			mark3 = input.nextInt();
			mark4 = input.nextInt();
			
			avg = (mark1+mark2+mark3+mark4)/4.0;
			
		//calculate the average	
		if(avg >= 75){
			grade = "Distiction";
		}else if(avg >= 50){
			grade = "Credit";
		}else{
			grade = "Fail";
		}
		
		
		System.out.println("Average is :" + avg);
		System.out.println("Credit : " + grade);
		System.out.println();
		}
		
		
	}
}