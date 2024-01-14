package PB01FirstStepsInCoding.Class;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaToWorkOn = Double.parseDouble(scanner.nextLine());
        double pricePerSquareMeter = 7.61;
        double discount = (areaToWorkOn * pricePerSquareMeter) * 0.18;
        double priceAfterDiscount = (pricePerSquareMeter * areaToWorkOn) - discount;

        System.out.printf("The final price is: %.2f lv. %n The discount is: %.2f lv.", priceAfterDiscount, discount);

    }
}
