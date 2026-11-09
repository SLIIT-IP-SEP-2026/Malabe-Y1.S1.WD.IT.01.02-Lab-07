public class IT26102000Lab7Q2C{
	
	public static void main(String[] args){
	
	int row, column, count = 5;
		
		for(row = 1; row <= 5; row++){
			
			for(column = 1; column <= count && count > 0; column++){
				
				System.out.print(count);
					
			}
			
			count = count - 1;
			System.out.println();
			
		}
	} 
}