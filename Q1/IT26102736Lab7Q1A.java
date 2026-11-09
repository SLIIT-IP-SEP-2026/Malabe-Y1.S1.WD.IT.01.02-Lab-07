import java.util.Scanner;
public class IT26102736Lab7Q1A{
	public static void main(String[] args){
		//creating a scanner object
		Scanner input = new Scanner(System.in);
		
		//declarign variables 
		int i=1;
		double marks,total=0 , average;
		String grade;
		
		//looping for 4 inputs
		while (i<=4){
			
			//get an inputw
			System.out.print("Enter Subject Mark " +i +": ");
			marks = input.nextDouble();
			i++;
			total = total + marks;
		}
		
		//calculating amd displaying average
		average = total/ (i-1);
		System.out.println("\nAverage is : " +average);
		
		//check grade
		if (average >= 75) {
			grade = "Distinction";
		} else if (average >= 50) {
			grade = "Credit";
		}else {
			grade = "Fail";
		}
		System.out.println("Overall grade is : " +grade); 
	}
}