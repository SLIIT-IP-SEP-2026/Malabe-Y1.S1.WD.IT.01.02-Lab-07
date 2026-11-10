import java.util.Scanner;
public class IT26102533Lab7Q1A{
	public static void main(String[] args){
		
		int m1,m2,m3,m4;
		double sum,avg;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter marks for four subjects : ");
		System.out.print("Enter Subject mark 1 : ");
		m1 = input.nextInt();
		System.out.print("Enter Subject mark 2 : ");
		m2 = input.nextInt();
		System.out.print("Enter Subject mark 3 : ");
		m3 = input.nextInt();
		System.out.print("Enter Subject mark 4 : ");
		m4 = input.nextInt();
		System.out.println();
		
		sum = m1 + m2 + m3 + m4;
		avg = sum / 4.0;
		
		if (avg>=75 && avg<=100){
			System.out.println("Average is : "+avg);
			System.out.print("Overall Grade is : Distinction ");
		}
		if (avg>=50 && avg<=74){
			System.out.println("Average is : "+avg);
			System.out.print("Overall Grade is : Credit ");
		}
		if (avg>=0 && avg<=49){
			System.out.println("Average is : "+avg);
			System.out.print("Overall Grade is : Fail ");
		}
		
		
	}
}