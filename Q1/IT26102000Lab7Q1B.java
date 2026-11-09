import java.util.Scanner;

public class IT26102000Lab7Q1B{
	
	public static void main(String[] args){
		
		double mark1, mark2, mark3, mark4, sum, average;
		int studentCount = 1;
		
		Scanner input = new Scanner(System.in);
		
		while(studentCount <= 3){
		
		System.out.print("Student " + studentCount);
		
		
		System.out.print("Enter marks: ");
		mark1 = input.nextDouble();
		mark2 = input.nextDouble();
		mark3 = input.nextDouble();
		mark4 = input.nextDouble();
		
		sum = mark1 + mark2 + mark3 + mark4;
		average = sum / 4;
		System.out.println("\nAverage is: " + average); 
		
		if(average >= 75){
			
			System.out.println("Overall grade is: Distinction");
			
		}
		else if(average >= 50){
			
			System.out.println("Overall grade is: Credit");
			
		}
		else{
			
			System.out.println("Overall grade is: Fail");
			
		}
		
		System.out.println();
		studentCount++;
		
		}
		
	}
}