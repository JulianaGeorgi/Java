package Fundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class F09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= ordersCount; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double coffeePrice = ((daysInMonth * capsulesCount) * pricePerCapsule);

            System.out.printf("The price for the coffee is: $%.2f\n", coffeePrice);

            totalPrice += coffeePrice;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
