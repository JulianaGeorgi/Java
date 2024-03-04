package Basics.PB01FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int feePerYear = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = feePerYear * 0.60;
        double clothesPrice = sneakersPrice - (sneakersPrice * 0.2);
        double ballPrice = clothesPrice / 4;
        double accessoriesPrice = ballPrice / 5;

        double totalExpenses = feePerYear + sneakersPrice + clothesPrice + ballPrice + accessoriesPrice;

        System.out.println(totalExpenses);
    }
}
