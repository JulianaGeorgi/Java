package PB05WhileLoop.Exercises;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int maxNumOfBoxes = width * length * height;

        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            int currentNumOfBoxes = Integer.parseInt(command);

            maxNumOfBoxes -= currentNumOfBoxes;

            if (maxNumOfBoxes <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(maxNumOfBoxes));
                break;
            }

            command = scanner.nextLine();
        }

        if (maxNumOfBoxes > 0) {
            System.out.printf("%d Cubic meters left.", maxNumOfBoxes);
        }
    }
}
