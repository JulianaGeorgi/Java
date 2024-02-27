package PB06NestedLoops.Lab;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double tripPrice = Double.parseDouble(scanner.nextLine());
            double availableMoney = 0;

            while (availableMoney < tripPrice) {
                double savedMoney = Double.parseDouble(scanner.nextLine());
                availableMoney += savedMoney;
            }

            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }
    }
}
