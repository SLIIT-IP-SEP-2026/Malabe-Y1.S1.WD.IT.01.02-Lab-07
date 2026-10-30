import java.util.Scanner;

public class IT26102589Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Student 1");
        System.out.print("Enter four marks separated by space: ");
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int a3 = input.nextInt();
        int a4 = input.nextInt();
        double avg1 = (a1 + a2 + a3 + a4) / 4.0;
        System.out.println("Average: " + avg1);
        if (avg1 >= 75) {
            System.out.println("Grade: Distinction");
        } else if (avg1 >= 50) {
            System.out.println("Grade: Credit");
        } else {
            System.out.println("Grade: Fail");
        }

        System.out.println("Student 2");
        System.out.print("Enter four marks separated by space: ");
        int b1 = input.nextInt();
        int b2 = input.nextInt();
        int b3 = input.nextInt();
        int b4 = input.nextInt();
        double avg2 = (b1 + b2 + b3 + b4) / 4.0;
        System.out.println("Average: " + avg2);
        if (avg2 >= 75) {
            System.out.println("Grade: Distinction");
        } else if (avg2 >= 50) {
            System.out.println("Grade: Credit");
        } else {
            System.out.println("Grade: Fail");
        }

        System.out.println("Student 3");
        System.out.print("Enter four marks separated by space: ");
        int c1 = input.nextInt();
        int c2 = input.nextInt();
        int c3 = input.nextInt();
        int c4 = input.nextInt();
        double avg3 = (c1 + c2 + c3 + c4) / 4.0;
        System.out.println("Average: " + avg3);
        if (avg3 >= 75) {
            System.out.println("Grade: Distinction");
        } else if (avg3 >= 50) {
            System.out.println("Grade: Credit");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}