import java.util.Scanner;

public class IT26102567Lab7Q3 {

    public static void main(String[] args) {

        // Create Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        // Loop for 5 customers
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);

            // Enter total bill amount
            System.out.print("Enter total bill amount: ");
            double amount = input.nextDouble();

            // Enter mode of payment
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = input.next().charAt(0);

            // Validation and calculation
            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = amount * 0.05;
                double netAmount = amount - discount;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + netAmount);
            } 
            else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + amount);
            } 
            else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println(); // Blank line between customers
        }

        input.close();
    }
}