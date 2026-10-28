import java.util.Scanner;

public class IT26102479Lab7Q2C {
    public static void main(String[] args) {

        int rows = 5;

       
        for (int rowCount = rows; rowCount >= 1; rowCount--) {

            
            for (int columncount = 1; columncount <= rowCount; columncount++) {
                System.out.print(rowCount);
            }
            System.out.println();
        }
    }
}