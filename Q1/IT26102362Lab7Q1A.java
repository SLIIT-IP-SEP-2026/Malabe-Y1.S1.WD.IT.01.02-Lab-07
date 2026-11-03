import java.util.Scanner;
public class IT26102362Lab7Q1A{
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		double marks, total = 0, average;
		int count = 1;
		
		do{
			System.out.print("Enter subject "+count+ " marks: ");
			marks = input.nextDouble();
			
			if (marks>=0 && marks<=100){
				total +=marks;
				count++;
			}
			else{
				System.out.println("Invalid number");
			}
		}while(count<=4);
			
		average = (total)/4;
		
		if (average>= 75){
			System.out.println("\nGrade is : Distinction");
		}
		else if(average<=49){
			System.out.println("\nGrade is : Fail");
		}
		else{
			System.out.println("\nGrade is : Credit");
		}
	}
}