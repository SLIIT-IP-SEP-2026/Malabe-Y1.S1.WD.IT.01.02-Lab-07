import java.util.Scanner;
public class  IT26102480Lab7Q1A{
	public static void main(String[]args){

	 int mark1,mark2,mark3,mark4;
	 double avg;
	 String grade;

	 Scanner input = new Scanner(System.in);

	 System.out.println("Enter marks for four subjects:");

		System.out.print("Enter subject marks 1:");
		mark1= input.nextInt();

		System.out.print("Enter subject marks 2:");
		mark2= input.nextInt();

		System.out.print("Enter subject marks 3:");
		mark3= input.nextInt();

		System.out.print("Enter subject marks 4:");
		mark4= input.nextInt();

		avg= (mark1+mark2+mark3+mark4)/4;

		if (avg >=75){
		 grade="Distinction";
		}
		else if (avg >=50) {
		grade="Credit";
		}
		else{
		grade="Fail";
		}


	System.out.println("Average is:"+avg);
	System.out.println("Overall Grade is :"+grade);

	}
}