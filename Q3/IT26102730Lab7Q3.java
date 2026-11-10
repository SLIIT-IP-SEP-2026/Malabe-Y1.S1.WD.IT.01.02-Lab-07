import java.util.Scanner;

public class IT26102730Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for(int i = 1; i <= 5; i++) {

            System.out.println("\nCustomer " + i);

            System.out.print("Enter Bill Amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter Payment Mode (C/O): ");
            char mode = input.next().charAt(0);

            if(mode == 'C' || mode == 'c') {

                double discount = bill * 0.05;
                double amount = bill - discount;

                System.out.println("Discount = " + discount);
                System.out.println("Amount to Pay = " + amount);

            } else if(mode == 'O' || mode == 'o') {

                System.out.println("Discount = No discount applicable");
                System.out.println("Amount to Pay = " + bill);

            } else {

                System.out.println("Payment Mode is Not Valid");
            }
        }
    }
}