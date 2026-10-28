import java.util.Scanner;

public class IT26102687Lab7Q1B{
	 public static void main(String[]args){
	 String grade;
	 
	 int studentCount=1;
	 
	 Scanner input = new Scanner(System.in);
	  while(studentCount<=3){
	 System.out.println("Student" +studentCount);
	 
	 System.out.print("Enter Marks:");
	 int sub1 = input.nextInt();
	 int sub2 = input.nextInt();
	 int sub3 = input.nextInt();
	 int sub4 = input.nextInt();
	 
	 double average = (sub1+sub2+sub3+sub4)/4.0;
	 
	 if(average>=75){
		 grade="Distintion";
	 }else if (average>=50){
		 grade="Credit";
	 }else{
		 grade="Fail";
	 }
	 
	
	 System.out.println("Average is:" +average);
	 System.out.println("Overall grade is:" +grade);
	 System.out.println();
	 
	 studentCount++;
	  }
	 }
	
}