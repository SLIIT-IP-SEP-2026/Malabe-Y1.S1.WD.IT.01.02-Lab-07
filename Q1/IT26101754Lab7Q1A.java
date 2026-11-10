import java.util.Scanner;

   public class IT26101754Lab7Q1A {
   
      public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  int mark1,mark2,mark3,mark4,sum;
	  double average;
	  String grade;
	  
	  System.out.println("Enter marks for four subjects : ");
	  
	  System.out.print("Enter subjects Mark 1 : ");
	  mark1 = sc.nextInt();
	  
	  System.out.print("Enter subjects Mark 2 : ");
	  mark2 = sc.nextInt();
	  
	  System.out.print("Enter subjects Mark 3 : ");
	  mark3 = sc.nextInt();
	  
	  System.out.print("Enter subjects Mark 4 : ");
	  mark4 = sc.nextInt();
	  
	 
	  sum = mark1 + mark2 + mark3 + mark4;
	  average = sum/4.0;
	  System.out.println("Average is : " + average);
	  
	   if( average >= 75){
	     grade = "Distinction";
      }
      else if( average >= 50){
	     grade = "Credit";
	  }
	  else {
	     grade = "Fail";
	  }
	  
	  System.out.println();
	  System.out.println("overall Grade is : " + grade);
  
	}
}	
	  

     	  
		 