import java.util.Scanner;

public class IT26102736Lab7Q3 {
    public static void main(String[] args) {
        // Creating Object
        Scanner input = new Scanner(System.in);

        double totalBill, discount = 0.05, discountAmount, finalAmount;
        char option;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i + " :");
            System.out.print("Enter total bill amount: ");
            totalBill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            option = input.next().charAt(0);
            
            option = Character.toUpperCase(option);

            switch (option) {
                case 'C':
                    discountAmount = totalBill * discount;
                    finalAmount = totalBill - discountAmount;
                    System.out.println("Discount is : " + discountAmount);
                    System.out.println("Amount to be paid: " + finalAmount);
                    break;

                case 'O':
                    finalAmount = totalBill;
                    System.out.println("No discount applicable");
                    System.out.println("Amount to be paid: " + finalAmount);
                    break;

                default:
                    System.out.println("Payment Mode is Not Valid");
                    break;
            }
            System.out.println(); 
        }
    }
}