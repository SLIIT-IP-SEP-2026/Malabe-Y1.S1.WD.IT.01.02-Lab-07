import java.util.Scanner;

public class IT26101608Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;
        double totalBill, discount, payAmount;
        char mode;

        for (i = 1; i <= 5; i++) {

            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            totalBill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            mode = input.next().charAt(0);

            if (mode == 'C' || mode == 'c') {
			
                discount = totalBill * 0.05;
                payAmount = totalBill - discount;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + payAmount);
				
            } else if (mode == 'O' || mode == 'o') {
			
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + totalBill);
				
            } else {
			
                System.out.println("Payment Mode is Not Valid");
				
            }

            System.out.println();
        }

    }
}