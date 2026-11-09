import java.util.Scanner;

public class IT26102591Lab7Q1B {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter marks for four subjects:");

        int i = 0;

        while (i < 3) {

            System.out.println("Enter marks for student " + (i + 1) + ":");

            double mark1 = Input.nextDouble();
            double mark2 = Input.nextDouble();
            double mark3 = Input.nextDouble();
            double mark4 = Input.nextDouble();

            double total = mark1 + mark2 + mark3 + mark4;
            double avg = total / 4;

            System.out.println("Average is " + avg);

            if (avg >= 75) {
                System.out.println("Overall grade is Distinction");
            }
            else if (avg >= 50) {
                System.out.println("Overall grade is Credit");
            }
            else {
                System.out.println("Overall grade is Fail");
            }

            i++;
        }

        Input.close();
    }
}
