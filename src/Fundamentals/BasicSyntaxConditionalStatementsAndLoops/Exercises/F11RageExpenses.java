package Fundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class F11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadSetsCount = lostGamesCount / 2;
        int trashedMousesCount = lostGamesCount / 3;
        int trashedKeyboardsCount = lostGamesCount / 6; // Every 6th game trashes a keyboard
        int trashedDisplayCount = trashedKeyboardsCount / 2; // Every second keyboard trashes a display

        double totalExpenses = (trashedHeadSetsCount * headSetPrice) +
                (trashedMousesCount * mousePrice) +
                (trashedKeyboardsCount * keyboardPrice) +
                (trashedDisplayCount * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}
