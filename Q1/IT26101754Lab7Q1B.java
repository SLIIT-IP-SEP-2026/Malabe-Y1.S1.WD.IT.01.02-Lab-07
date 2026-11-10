import java.util.Scanner;

   public class IT26101754Lab7Q1B {
   
      public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  
	  int mark1,mark2,mark3,mark4,sum;
	  double average;
	  String grade;
	  int studentCount = 1;
	  
	  while(studentCount <= 3) {
	    System.out.println("student" + studentCount);
		
		System.out.print("Enter Marks : ");
		mark1 = sc.nextInt();
		mark2 = sc.nextInt();
		mark3 = sc.nextInt();
		mark4 = sc.nextInt();
		
		sum = (mark1 + mark2 + mark3 + mark4);
		double avg = sum/4.0;
		System.out.print("Average is : " + avg);
		
		
		if (avg >= 75) {
		    grade = "Distinction";
		} else if (avg >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println();
        System.out.print("overall Grade is : " + grade);
        System.out.println();

        studentCount++;

      }
	}
}	

	
		