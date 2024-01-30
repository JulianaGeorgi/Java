package PB04ForLoop.Exercises;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double finalPrice = 0;
        double moneyLeft = 0;

        switch (flowerType) {
            case "Roses":
                if (numberOfFlowers > 80) {
                    finalPrice = (numberOfFlowers * 5.0) * 0.9;
                } else {
                    finalPrice = numberOfFlowers * 5.0;
                }
                break;
            case "Dahlias":
                if (numberOfFlowers > 90) {
                    finalPrice = (numberOfFlowers * 3.8) * 0.85;
                } else {
                    finalPrice = numberOfFlowers * 3.8;
                }
                break;
            case "Tulips":
                if (numberOfFlowers > 80) {
                    finalPrice = (numberOfFlowers * 2.8) * 0.85;
                } else {
                    finalPrice = numberOfFlowers * 2.8;
                }
                break;
            case "Narcissus":
                if (numberOfFlowers < 120) {
                    finalPrice = (numberOfFlowers * 3.0) * 1.15;
                } else {
                    finalPrice = numberOfFlowers * 3.0;
                }
                break;
            case "Gladiolus":
                if (numberOfFlowers < 80) {
                    finalPrice = (numberOfFlowers * 2.5) * 1.2;
                } else {
                    finalPrice = numberOfFlowers * 2.5;
                }
                break;
        }

        if (finalPrice <= budget) {
            moneyLeft = budget - finalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flowerType, moneyLeft);
        } else {
            moneyLeft = finalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", moneyLeft);
        }
    }
}
