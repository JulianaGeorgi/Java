package Basics.PB01FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfChickenMenus = Integer.parseInt(scanner.nextLine());
        int numberOfFishMenus = Integer.parseInt(scanner.nextLine());
        int numberOfVeggieMenus = Integer.parseInt(scanner.nextLine());

        double costOfMenus = (numberOfChickenMenus * 10.35) + (numberOfFishMenus * 12.40) + (numberOfVeggieMenus * 8.15);
        double desertPrice = costOfMenus * 0.2;

        double orderTotalWithDelivery = costOfMenus + desertPrice + 2.50;

        System.out.println(orderTotalWithDelivery);
    }
}
