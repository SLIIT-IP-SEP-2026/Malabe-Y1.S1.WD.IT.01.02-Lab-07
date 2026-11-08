import java.util.Scanner;
public class IT26102098Lab7Q1A {
	
	public static void main(String[] args) {
		
		int Mark1, Mark2, Mark3, Mark4;
		double  avg;
		String grade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter marks for four subjects: ");
		
		System.out.print("Enter Subject Mark 1: ");
		Mark1 = input.nextInt();
		
		System.out.print("Enter Subject Mark 2: ");
		Mark2 = input.nextInt();
		
		System.out.print("Enter Subject Mark 3: ");
		Mark3 = input.nextInt();
		
		System.out.print("Enter Subject Mark 4: ");
		Mark4 = input.nextInt();
		
		avg = (Mark1 + Mark2 + Mark3 + Mark4)/4.0;
		
		if (avg >= 75) {
			grade = "Distinction";
			
		}else if(avg >= 50) {
			grade = "Credit";
			
		}else{
			grade = "Fail";
		}
		
		System.out.println();
		System.out.println("Average is : "+avg);
		System.out.println("Overall Grade is : "+grade);
		
	}
}