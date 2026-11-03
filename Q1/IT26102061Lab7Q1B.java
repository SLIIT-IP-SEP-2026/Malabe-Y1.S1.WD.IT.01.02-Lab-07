import java.util.Scanner;
public class IT26102061Lab7Q1B{
	public static void main(String[] args){
		
		
		int student=1,input_turn;
		
		Scanner input=new Scanner(System.in);
		do{
			double mark,sum=0.0;
			double ave;
			int num=1;
			System.out.println("\nStudent"+student);
			
			do{
				System.out.print("Enter marks : ");
				
					for(input_turn=1;input_turn<=4;input_turn++){
						
					
						mark=input.nextInt();
					
						if(mark>=0&& mark<=100){
					
						sum=sum+mark;
				
						num++;
						mark++;
						}
						else{
							System.out.println("\n -- Enter valid Mark -- \n");
						}
					}
				
			}while(num<=4);
			
			ave=sum/4;
			
			System.out.println("Average is : "+ave);
			
			if(ave>=75 && ave<=100){
				System.out.println("Overall Grade is : Distinction");
			}
			else if(ave>=50 && ave<=74){
				System.out.println("Overall Grade is : Credit");
			}
			else
			{
				System.out.println("Overall Grade is : Fail");
			}
			
			student++;
		}while(student<=3);
	}
}
			
		
		
		
		
		
			
			
			
		
		