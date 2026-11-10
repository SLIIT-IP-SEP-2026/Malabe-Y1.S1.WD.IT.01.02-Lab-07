import java.util.Scanner;
public class IT26102567Lab7Q2B{
	public static void main(String[] args){
		
		//loop from 1 to 5
		for(int i = 1; i <= 5; i++){
			System.out.print(i + "-");
			
			//Inner loop to display 'i'number of stars
			for(int j = 1; j <= i;  j++){ 
			System.out.print("*");
			}
			
			//Move on to the next line after each row
			System.out.println();
			
		}
		
	}
	
}
	
