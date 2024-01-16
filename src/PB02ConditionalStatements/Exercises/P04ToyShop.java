package PB02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());

        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        double puzzlesPrice = puzzlesCount * 2.6;
        double dollsPrice = dollsCount * 3;
        double teddyBearsPrice = bearsCount * 4.1;
        double minionsPrice = minionsCount * 8.2;
        double trucksPrice = trucksCount * 2;

        int totalNumOfToysSold = puzzlesCount + dollsCount + bearsCount + minionsCount + trucksCount;
        double totalPrice = puzzlesPrice + dollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;

        if (totalNumOfToysSold >= 50) {
            double totalPriceAfterDiscount = totalPrice - (totalPrice * 0.25);
            totalPrice = totalPriceAfterDiscount;
        }

        double moneyLeftAfterRent = totalPrice - (totalPrice * 0.1);

        if (moneyLeftAfterRent >= tripPrice) {
            double moneyLeft = moneyLeftAfterRent - tripPrice;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            double moneyNeeded = tripPrice - moneyLeftAfterRent;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
        }
    }
}
