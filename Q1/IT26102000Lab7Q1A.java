import java.util.Scanner;

public class IT26102000Lab7Q1A{
	
	public static void main(String[] args){
		
		double mark1, mark2, mark3, mark4, sum, average;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter marks for four subjects:");
		
		System.out.print("Enter subject mark 1: ");
		mark1 = input.nextDouble();
		
		System.out.print("Enter subject mark 2: ");
		mark2 = input.nextDouble();
		
		System.out.print("Enter subject mark 3: ");
		mark3 = input.nextDouble();
		
		System.out.print("Enter subject mark 4: ");
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
		
	}
}