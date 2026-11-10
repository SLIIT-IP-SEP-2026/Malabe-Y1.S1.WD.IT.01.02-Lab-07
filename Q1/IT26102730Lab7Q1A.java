import java.util.Scanner;

public class IT26102730Lab7Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double m1, m2, m3, m4, avg;
        String grade;

        System.out.print("Enter Subject Mark 1: ");
        m1 = input.nextDouble();

        System.out.print("Enter Subject Mark 2: ");
        m2 = input.nextDouble();

        System.out.print("Enter Subject Mark 3: ");
        m3 = input.nextDouble();

        System.out.print("Enter Subject Mark 4: ");
        m4 = input.nextDouble();

        avg = (m1 + m2 + m3 + m4) / 4;

        if (avg >= 75)
            grade = "Distinction";
        else if (avg >= 50)
            grade = "Credit";
        else
            grade = "Fail";

        System.out.println("Average is : " + avg);
        System.out.println("Overall Grade is : " + grade);
    }
}