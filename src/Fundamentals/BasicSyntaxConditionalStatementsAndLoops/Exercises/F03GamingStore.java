package Fundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class F03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double initialBalance = Double.parseDouble(scanner.nextLine());

        double currentBalance = initialBalance;

        String input = scanner.nextLine();

        while (!input.equals("Game Time")) {

            double gamePrice = 0.00;

            switch (input) {
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                default:
                    System.out.println("Not Found");
                    input = scanner.nextLine();
                    continue;
            }

            if (currentBalance <= 0) {
                System.out.println("Out of money!\n");
                return;
            }

            if (currentBalance - gamePrice < 0) {
                System.out.println("Too Expensive");
            } else {
                currentBalance -= gamePrice;
                System.out.printf("Bought %s\n", input);
            }

            input = scanner.nextLine();
        }

        if (currentBalance <= 0) {
            System.out.println("Out of money!\n");
        } else {
            double totalSpendings = initialBalance - currentBalance;
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpendings, currentBalance);
        }
    }
}
