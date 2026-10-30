import java.util.Scanner;

public class IT26102589Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char mode = input.next().charAt(0);

            if (mode == 'C' || mode == 'c') {
                double discount = bill * 5 / 100;
                double amountToPay = bill - discount;
                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
            } else if (mode == 'O' || mode == 'o') {
                double discount = 0;
                double amountToPay = bill;
                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }
    }
}