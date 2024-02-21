package PB05WhileLoop.Exercises;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int spendingDaysCounter = 0;
        int daysCounter = 0;

        boolean hasEnoughMoney = false;

        while (spendingDaysCounter < 5) {
            if (availableMoney >= neededMoney) {
                hasEnoughMoney = true;
                break;
            }

            String command = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            daysCounter++;

            switch (command) {
                case "spend":
                    spendingDaysCounter++;
                    availableMoney -= amount;
                    if (availableMoney < 0) {
                        availableMoney = 0;
                    }
                    break;
                case "save":
                    availableMoney += amount;
                    spendingDaysCounter = 0;
                    break;
            }
        }

        if(hasEnoughMoney){
            System.out.printf("You saved the money for %d days.", daysCounter);
        } else {
            System.out.printf("You can't save the money.%n%d", daysCounter);
        }
    }
}
