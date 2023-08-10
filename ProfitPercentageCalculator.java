import java.util.Scanner;

public class ProfitPercentageCalculator {
    public static void main(String[] args) {
        Scanner Sys = new Scanner(System.in);

        System.out.println("Enter the number of dozens of toys purchased");
        int x = Sys.nextInt();

        System.out.println("Enter the price per dozen");
        int y = Sys.nextInt();

        System.out.println("Enter the selling price of 1 toy");
        int z = Sys.nextInt();

        double costPricePerToy = y / 12.0;
        double sellingPricePerToy = z;
        double gainPerToy = sellingPricePerToy - costPricePerToy;
        double profitPercentage = (gainPerToy / costPricePerToy) * 100;

        System.out.printf("Sam's profit percentage is %.2f percent%n", profitPercentage);
    }
}
