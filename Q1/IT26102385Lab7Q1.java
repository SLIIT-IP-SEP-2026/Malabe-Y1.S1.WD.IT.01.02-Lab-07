import java.util.Scanner;
public class IT26102385Lab7Q1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the marks for four subjects");
		
		System.out.print("Enter the m1:");
		int m1=sc.nextInt();
		System.out.print("Enter the m2:");
		int m2=sc.nextInt();
		System.out.print("Enter the m3:");
		int m3=sc.nextInt();
		System.out.print("Enter the m4:");
		int m4=sc.nextInt();
		
		
		double sum=m1+m2+m3+m4;
		double average=sum/4;
		
		
		if(average>=75){
			System.out.println("Distinction");
		}
		else if (average>=50){
			System.out.println("Credit");
		}
		else{
			System.out.println("Fail");
		}
		
		
		
		System.out.println("average is"+average);
		
	}
}
		
		
			
		