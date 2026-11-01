import java.util.Scanner;

public class IT26102633Lab7Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
	System.out.println("Enter marks for four subjects:");
        
        System.out.print("Enter Subject Mark 1: ");
        double mark1 = scanner.nextDouble();
        
        System.out.print("Enter Subject Mark 2: ");
        double mark2 = scanner.nextDouble();
        
        System.out.print("Enter Subject Mark 3: ");
        double mark3 = scanner.nextDouble();
        
        System.out.print("Enter Subject Mark 4: ");
        double mark4 = scanner.nextDouble();	
		
		double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
		
		String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average <= 74.99) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }
		
		System.out.println("Average Mark: " + average);
        System.out.println("Overall Grade: " + grade);
		
	}
	
}
