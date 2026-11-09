
import java.util.Scanner;

public class IT26102686Lab7Q3 {
    public static void main(String[] args) {

        final double DISCOUNT_RATE = 0.05;
        final int NO_OF_CUSTOMERS = 5;

        double billAmount, Amounttobepaid;
        char paymentMode;

        double discount = 0;

        Scanner input = new Scanner(System.in);

        for(int customerCount = 1; customerCount <= NO_OF_CUSTOMERS; customerCount++) {

            System.out.println("Customer " + customerCount);

            System.out.print("Enter the total Bill Amount : ");
            billAmount = input.nextDouble();

            System.out.print("Enter the Mode of Payment (C for Cash , O for Other) : ");
            paymentMode = input.next().toUpperCase().charAt(0);

            if(paymentMode == 'C') {

                //calculate the discount
                discount = billAmount * DISCOUNT_RATE;
                Amounttobepaid = billAmount - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid : " + Amounttobepaid);

            }
            else if(paymentMode == 'O') {

                // no discount for O
                Amounttobepaid = billAmount;

                System.out.println("Discount is : No Discount Applicable");
                System.out.println("Amount to be paid : " + Amounttobepaid);

            }
            else {
                System.out.println("Payment mode is Not valid");
                continue; //skip to the next customer
            }

            System.out.println();
        }
    }
}
