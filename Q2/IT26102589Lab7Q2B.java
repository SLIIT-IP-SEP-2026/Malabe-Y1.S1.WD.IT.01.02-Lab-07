public class IT26102589Lab7Q2B {
    public static void main(String[] args) {
        for (int num = 1; num <= 5; num++) {
            System.out.print(num + " - ");
            for (int star = 1; star <= num; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}