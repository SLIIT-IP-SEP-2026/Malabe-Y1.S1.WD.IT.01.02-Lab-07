import java.util.Scanner;

public class IT26102533Lab7Q1B {
    public static void main(String[] args) {

        int m1, m2, m3, m4;
        int student = 1;
        double sum, avg;

        Scanner input = new Scanner(System.in);

        while (student <= 3) {

            System.out.println("Student " + student);
            System.out.print("Enter marks for four subjects: ");
            m1 = input.nextInt();
            m2 = input.nextInt();
            m3 = input.nextInt();
            m4 = input.nextInt();

            sum = m1 + m2 + m3 + m4;
            avg = sum / 4.0;

            System.out.println("Average is: " + avg);

            if (avg >= 75 && avg <= 100) {
                System.out.println("Overall Grade is: Distinction");
            } else if (avg >= 50 && avg < 75) {
                System.out.println("Overall Grade is: Credit");
            } else if (avg >= 0 && avg < 50) {
                System.out.println("Overall Grade is: Fail");
            } else {
                System.out.println("Invalid marks");
            }

            System.out.println();

            student++;
        }

        
    }
}
