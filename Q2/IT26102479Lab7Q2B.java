import java.util.Scanner;

public class IT26102479Lab7Q2B{
    public static void main(String[] args) {

        int rows = 5;


        for (int rowCount = 1; rowCount <= rows; rowCount++) {

            System.out.print(rowCount + " - ");

            
            for (int columncount = 1; columncount <= rowCount; columncount++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}