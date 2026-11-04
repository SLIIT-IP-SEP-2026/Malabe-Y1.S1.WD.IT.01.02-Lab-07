import java.util.Scanner;
public class IT26102402Lab7Q2A{
	public static void main(String[]args){
		
		int rows = 4;
		int columns = 5;
		
		//loop through the rows
		//starts with 0 -> 0,1,2,3
		for(int rowCount = 0; rowCount<rows ; rowCount++ ){
			//loop through the columns
			for(int columncount = 0; columncount<rows; columncount++){
				System.out.print("$");
			}
			System.out.println();
		}
		
		
	}
}