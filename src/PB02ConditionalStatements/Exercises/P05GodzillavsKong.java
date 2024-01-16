package PB02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P05GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countExtras = Integer.parseInt(scanner.nextLine());
        double priceForClothesForOnePerson = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;

        double priceForClothes = priceForClothesForOnePerson * countExtras;

        if(countExtras > 150){
            priceForClothes = priceForClothes * 0.9;
        }

        double finalSum = priceForClothes + decorPrice;
        double difference = Math.abs(finalSum -budget);

        if (finalSum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }
    }
}
