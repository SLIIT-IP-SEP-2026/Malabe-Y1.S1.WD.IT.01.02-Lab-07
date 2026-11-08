import java.util.Scanner;

public class IT26102641Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
		int studentCount = 1; // start from 1
		while (studentCount <= 3) { // run while count is 1 to 3
		
		System.out.println("Student " + studentCount);
		System.out.print("Enter Subject Marks: ");
        
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
		if (average >= 75) grade = "Distinction";
		else if (average >= 50 && average <= 74) grade = "Credit";
		else grade = "Fail";

        System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
			
			studentCount++;
		}
        scanner.close();
		
	}
}