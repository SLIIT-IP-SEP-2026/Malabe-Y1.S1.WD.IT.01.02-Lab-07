import java.util.Scanner;
public class IT26102362Lab7Q1B{
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		double marks, total, average;
		int count = 1,i;
		
		do{
			total = 0;
			average = 0;
			
			System.out.print("Student "+count+"\nEnter marks: ");
			
			for(i=1;i<5;i++){
				marks = input.nextDouble();
				total = total+marks;
			}
			
			average = total/4;
			System.out.println("Average is : "+ average);
			
			if (average>= 75){
				System.out.println("Overall Grade is : Distinction\n");
			}
			else if(average<=49){
				System.out.println("Overall Grade is : Fail\n");
			}
			else{
				System.out.println("Overall Grade is : Credit\n");
			}
			count++; 
			
		}while(count<=3);
			
	}
}