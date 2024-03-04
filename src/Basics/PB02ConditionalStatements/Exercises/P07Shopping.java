package Basics.PB02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCardsCount * 250.0;
        double processorPrice = processorsCount * (videoCardsPrice * 0.35);
        double ramPrice = ramCount * (videoCardsPrice * 0.1);

        double finalPrice = videoCardsPrice + processorPrice + ramPrice;
        double discount = 0;

        if (videoCardsCount > processorsCount) {
            discount = finalPrice * 0.15;
            finalPrice = finalPrice - discount;
        }

        double diff = Math.abs(budget - finalPrice);


        if (finalPrice <= budget) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }

    }
}
