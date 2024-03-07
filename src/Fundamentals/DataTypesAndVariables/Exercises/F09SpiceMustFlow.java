package Fundamentals.DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class F09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingAmount = Integer.parseInt(scanner.nextLine());
        int currentYield = startingAmount;

        int amountConsumedByEmployees = 26;

        int daysCount = 0;
        int spiceMined = 0;

        while (currentYield >= 100) {
            spiceMined += currentYield;
            daysCount++;

            if (spiceMined >= amountConsumedByEmployees) {
                spiceMined -= amountConsumedByEmployees;
            }

            currentYield -= 10;
        }

        if (spiceMined >= 26) {
            spiceMined -= 26;
        }

        System.out.printf("%d\n%d", daysCount, spiceMined);
    }
}
