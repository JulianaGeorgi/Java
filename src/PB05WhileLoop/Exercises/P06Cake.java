package PB05WhileLoop.Exercises;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int countOfCakePieces = width * length;

        String command = scanner.nextLine();

        while (!command.equals("STOP")) {

            int currentPiecesOfCake = Integer.parseInt(command);

            countOfCakePieces -= currentPiecesOfCake;

            if (countOfCakePieces <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countOfCakePieces));
                break;
            }

            command = scanner.nextLine();
        }

        if (countOfCakePieces > 0) {
            System.out.printf("%d pieces are left.", countOfCakePieces);
        }
    }
}
