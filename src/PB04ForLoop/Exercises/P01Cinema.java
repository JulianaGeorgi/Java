package PB04ForLoop.Exercises;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double profit = 0;

        switch (projectionType) {
            case "Premiere":
                profit = rows * columns * 12.0;
                break;
            case "Normal":
                profit = rows * columns * 7.5;
                break;
            case "Discount":
                profit = rows * columns * 5.0;
                break;
            default:
                break;
        }

        System.out.printf("%.2f leva", profit);
    }
}
