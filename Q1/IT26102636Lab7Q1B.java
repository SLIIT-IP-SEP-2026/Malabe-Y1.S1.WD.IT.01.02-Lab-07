import java.util.Scanner;

    public class IT26102636Lab7Q1B{
		public static void main(String[]args){
			
			double mark1,mark2,mark3,mark4,avg;
			int i;
			String grade;
			
			
		  Scanner input=new Scanner(System.in);
		  
		  for(i=1 ; i<=3 ; i++){
			  System.out.println("Student" + i);
			  System.out.print("Enter marks: ");
			  
			  mark1 = input.nextDouble();
			  mark2 = input.nextDouble();
			  mark3 = input.nextDouble();
			  mark4 = input.nextDouble();
			  
			  avg=(mark1+mark2+mark3+mark4)/4.0;
			  System.out.print("Average is: "+avg);
			  
			  if(avg>= 75){
				  grade="Distinction";
			  }else if(avg>=50){
				  grade="Credit";
			  }else{
				  grade="Fail";
			  }
			  System.out.println();
			  System.out.println("Overall Grade is: "+ grade);
		  }
	    }
	}