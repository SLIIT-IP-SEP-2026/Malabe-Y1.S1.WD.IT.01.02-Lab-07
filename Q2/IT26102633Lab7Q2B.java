public class IT26102633Lab7Q2B {
    public static void main(String[] args) {
        // Outer loop to handle row numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            // Print the row number and hyphen prefix
            System.out.print(i + " - ");
            
            // Inner loop to print stars matching the current row number
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
     
            System.out.println();
			
		}
		
	}
	
}