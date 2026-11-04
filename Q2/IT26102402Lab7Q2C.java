import java.util.Scanner;
public class IT26102402Lab7Q2C{
	public static void main(String[]args){
		int rows = 4;
		int columns = 5;
		for(int rowCount = 5; rowCount>= 1; rowCount-- ){			
			for(int columncount = 1; columncount<=rowCount; columncount++){
				System.out.print(rowCount);				
			}
			System.out.println();
		}		
	}
}