package Basics.PB01FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int naylonNeeded = Integer.parseInt(scanner.nextLine());
        int paintNeeded = Integer.parseInt(scanner.nextLine());
        int thinnerNeeded = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = Integer.parseInt(scanner.nextLine());

        double naylonPrice = (naylonNeeded + 2) * 1.50;
        double paintPrice = (paintNeeded + paintNeeded * 0.10) * 14.50;
        double thinnerPrice = thinnerNeeded * 5.00;

        double totalSumForMaterials = naylonPrice + paintPrice + thinnerPrice + 0.40;

        double workersCost = (totalSumForMaterials * 0.3) * hoursNeeded;

        System.out.println(workersCost + totalSumForMaterials);
    }
}
