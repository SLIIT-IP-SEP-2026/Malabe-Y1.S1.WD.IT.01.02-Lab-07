public class IT26102000Lab7Q2B{
	
	public static void main(String[] args){
		
		int row, column;
		
		for(row = 1; row <= 5; row++){
			
			System.out.print(row + " - ");
			
			for(column = 1; column <= row; column++){
				
				System.out.print("*");
				
			}
			
			System.out.println();
	
		}
		
		System.out.println();
	} 
}