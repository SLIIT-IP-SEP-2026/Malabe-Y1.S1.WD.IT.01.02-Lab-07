import java.util.Scanner;
public class IT26102462LAB7Q1B{
    public static void main (String []args){

     Scanner input = new Scanner(System.in);
	 double subject1,subject2,subject3,subject4,average;
	 int studentCount=1;
	 
	while (studentCount<=3){
		
	System.out.println("Student "+studentCount);
	 
	 System.out.print("Enter marks :");
	 subject1=input.nextDouble();
	 subject2=input.nextDouble();
	 subject3=input.nextDouble();
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
	 
	 studentCount++;
	}
	 }
}