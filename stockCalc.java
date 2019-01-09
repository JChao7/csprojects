
//stock calculator
import java.util.Scanner;

public class stockCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Limit Buy:");
        double buy = scan.nextDouble();

        System.out.println("Quantity:");
        int quantity = scan.nextInt();

        System.out.println("Reward Target:");
        double reward = scan.nextDouble();

        System.out.println("Risk Target:");
        double risk = scan.nextDouble();

        // output and calculations
        double cost = quantity * ((double) quantity + buy);
        System.out.println("Capital needed $" + cost);

        double profit = quantity * (reward - buy);
        System.out.println("Profit $" + profit);

        double loss = quantity * (risk - buy);
        System.out.println("Loss $" + loss);

        scan.close();
    }
}