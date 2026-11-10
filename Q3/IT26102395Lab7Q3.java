import java.util.Scanner;

public class IT26102395Lab7Q3 {
    public static void main(String[] args) {
        
        Scanner ok=new Scanner(System.in);

        final double dis = 0.05;
        int i=0;

        while(i<5){
        System.out.print("Enter total bill amount:");
        double total=ok.nextDouble();
        System.out.println();

        System.out.print("Enter mood of payment(C or cash,O or other):");
        char pay=ok.next().charAt(0) ;

        System.out.println();

        if(pay=='C'||pay=='c'){
            double discount=total*dis;
            System.out.println("Discount is : " + discount);
            double total_bill=total-discount;
            System.out.println("Amount to be paid :" + total_bill);

        }
        else if(pay=='O'||pay=='o'){

            System.out.println("No discount applicable");
            System.out.println("Amount to be paid :"+ total);
            
        }
        else{
            System.out.println("Payment mood is not valid");

            continue;
        }
        i++;
        
    }


    }   

    
}
