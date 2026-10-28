import java.util.Scanner;

public class IT26102479Lab7Q3 {
    public static void main(String[] args) {

        final double DISCOUNT_RATE = 0.05;
        final int NO_OF_CUSTOMERS = 5;

        double billAmount, Amounttobepaid;
        char paymentMode;

        double discount = 0;

        Scanner input = new Scanner(System.in);

        for (int customerCount = 1; customerCount <= NO_OF_CUSTOMERS; customerCount++) {
            System.out.println("Customer " + customerCount);

            System.out.println("Enter the total Bill Amount : ");
            billAmount = input.nextDouble();

            System.out.println("Enter the Mode of Payment (C for Cash , O for Other) : ");
            paymentMode = input.next().toUpperCase().charAt(0);

            if (paymentMode == 'C') {
                
                discount = billAmount * DISCOUNT_RATE;
                Amounttobepaid = billAmount - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid : " + Amounttobepaid);

            } else if (paymentMode == 'O') {
             
                Amounttobepaid = billAmount;

                System.out.println("No Discount Applicable");
                System.out.println("Amount to be paid : " + Amounttobepaid);

            } else {
                System.out.println("Payment mode Is not valid");
			}
       
            continue;
        }
        System.out.println();
   }
}