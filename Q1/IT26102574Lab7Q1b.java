import java.util.Scanner;

public class IT26102574Lab7Q1b{
	public static void main(Strings[]args){
	
	Scanner input = new Scanner(System.in);
	
	for(int i = 1; i<= 3; i++){
	System.out.println("Student"+ i);
	System.out.println("Enter the marks");
	
	
	int m1 = input.nextInt();
	int m2 = input.nextInt();
	int m3 = input.nextInt();
	int m4 = input.nextInt();
	
	doiuble average= (m1+m2+m3+m4)/4.0;
	
	System.out.println("Average is:" + average);
	
	if(average>=75){
		System.out.println("Overall grade is:Distiction");

	
	else if(average>=75){
		System.out.println("Overall grade is: Credit");	
		
	}
	
	else{System.out.println(Overall grade is: Fail);
	}
	System.out.println();
	
	
	}
	input.close();
	}

}
