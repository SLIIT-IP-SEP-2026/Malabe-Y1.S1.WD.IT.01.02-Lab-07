import java.util.Scanner;
public class IT26102477Lab7Q1A {
     public static void main (String [] args){
	 
	 int mark1,mark2,mark3,mark4;
	 double average;
	 String grade;
	 
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Enter subject for four subjects :");
	 
	 System.out.print("Enter subject mark 1: ");
	 mark1 = input.nextInt();
	 
	 System.out.print("Enter subject mark 2:");
	 mark2 = input.nextInt();
	 
	 System.out.print("Enter subject mark 3:");
	 mark3 = input.nextInt();
	 
	 System.out.print("Enter subject mark 4:");
	 mark4 = input.nextInt();
	 
	 average = (mark1 + mark2 + mark3 + mark4) / 4.0;
	 
	 if(average >= 75){
		 grade = "Distinction";
	 } else if (average >= 50){
		 grade = "credit";
	 }else {
		 grade = "Fail";
	 }
	 
	 System.out.println();
	 System.out.println("Average is :" + average);
	 System.out.println("Overall grade is :" + grade);
	 
	 
	 }
}