import java.util.Scanner;

public class IT26102641Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		  int customerCount = 1;
        while (customerCount <= 5) {

            System.out.println("Customer " + customerCount);

            System.out.print("Enter total bill amount: ");
            double billAmount = scanner.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char mode = scanner.next().charAt(0);

            if (mode == 'C' || mode == 'c') {
			
                double discount = billAmount * 5 / 100;
                double amountToPay = billAmount - discount;
				
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
				
            } else if (mode == 'O' || mode == 'o') {
			
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + billAmount);
				
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println(); 
            customerCount++;
        }
        scanner.close();
    }
}