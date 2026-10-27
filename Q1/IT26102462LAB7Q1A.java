import java.util.Scanner;
public class IT26102462LAB7Q1A{
    public static void main (String []args){

     Scanner input = new Scanner(System.in);
	 double subject1,subject2,subject3,subject4,average;
	 
	 System.out.println("Enter marks for four subject:");
	 
	 System.out.print("Enter subject mark 1 :");
	 subject1=input.nextDouble();
	 
	 System.out.print("Enter subject mark 2 :");
	 subject2=input.nextDouble();
	 
	 System.out.print("Enter subject mark 3 :");
	 subject3=input.nextDouble();
	 
	 System.out.print("Enter subject mark 4 :");
	 subject4=input.nextDouble();
	 
	 average = (subject1+subject2+subject3+subject4)/4;
	 System.out.println("the average of four subjects are :"+ average);
	 
	 if (average >=75){
		 System.out.println("overall Grade is :"+"Distintion");
		 
	 }
	 else if (average>=49){
		 System.out.println("overall Grade is :"+"credit");
	 }
	 else 
		 System.out.println("overall Grade is :"+"Fail");
	 
	 }
}