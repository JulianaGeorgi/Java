package Basics.PB01FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPenPackage = Integer.parseInt(scanner.nextLine());
        int countHighlighters = Integer.parseInt(scanner.nextLine());
        int cleaningAgent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double penPrice = countPenPackage * 5.80;
        double highlightersPrice = countHighlighters * 7.20;
        double cleaningAgentPrice = cleaningAgent * 1.20;

        double sumWithoutDiscount = penPrice + highlightersPrice + cleaningAgentPrice;

        double finalSum = sumWithoutDiscount - (sumWithoutDiscount * discount / 100);

        System.out.println(finalSum);
    }
}
