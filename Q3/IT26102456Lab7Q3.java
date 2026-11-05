import java.util.Scanner;

public class IT26102456Lab7Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalBill, discount, amountToPay;
        char paymentMode;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            totalBill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymentMode = input.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {

                discount = totalBill * 0.05;
                amountToPay = totalBill - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } 
            else if (paymentMode == 'O' || paymentMode == 'o') {

                amountToPay = totalBill;

                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + amountToPay);

            } 
            else {

                System.out.println("Payment Mode is Not Valid");

            }

            System.out.println();
        }

        input.close();
		
	}
}