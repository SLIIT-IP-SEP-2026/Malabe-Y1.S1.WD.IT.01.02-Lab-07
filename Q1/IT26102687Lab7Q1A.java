import java.util.Scanner;
 public class IT26102687Lab7Q1A{
 
 public static void main(String[]args){
	 String grade;
	 
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Enter marks for four subjects:");
	 
	 System.out.print("Enter subject Mark 01:");
	 int sub1 = input.nextInt();
	 
	 System.out.print("Enter subject Mark 02:");
	 int sub2 = input.nextInt();
	 
	 System.out.print("Enter subject Mark 03:");
	 int sub3 = input.nextInt();
     
	 System.out.print("Enter subject Mark 04:");
	 int sub4 = input.nextInt();
	 
	 double average = (sub1+sub2+sub3+sub4)/4.0;
	 
	 if(average>=75){
		 grade="Distintion";
	 }else if (average>=50){
		 grade="Credit";
	 }else{
		 grade="Fail";
	 }
	 
	 System.out.println();
	 System.out.println("Average is:" +average);
	 System.out.println("Overall grade is:" +grade);
 }
 }