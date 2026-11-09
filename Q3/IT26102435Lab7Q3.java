import java.util.Scanner;

public class IT26102435Lab7Q3 {
    public static void main(String[] args) {
        final double DISCOUNT_RATE = 0.05;
        final int NUM_CUSTOMERS = 5;

        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= NUM_CUSTOMERS; customer++) {
            System.out.println("Customer " + customer);
            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char mode = input.next().charAt(0);

            if (mode == 'C' || mode == 'c') {
                double discount = bill * DISCOUNT_RATE;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + (bill - discount));
                System.out.println();
            } else if (mode == 'O' || mode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + bill);
                System.out.println();
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
        }
    }
}