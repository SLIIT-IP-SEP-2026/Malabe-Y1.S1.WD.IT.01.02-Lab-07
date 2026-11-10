import java.util.Scanner;
public class IT26102567Lab7Q2C{
	public static void main (String[] args){
		
		//Outer loops of rows from 5 down to 1
		for(int i = 5; i >= 1; i--){
			
			//Inner looops to print number 'i' exactly 'i' times per row 
			for(int j = 1; j <= i; j++){ 
			System.out.print(i); 
			} 
			
			//Move to the next line after completing each row 
			System.out.println();
		}
		
	}
	
}