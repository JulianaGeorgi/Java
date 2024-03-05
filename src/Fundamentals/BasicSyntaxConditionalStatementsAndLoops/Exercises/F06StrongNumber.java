package Fundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class F06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int factorialsSum = 0;

        for (int i = 0; i < input.length(); i++) {
            int currentDigit = Integer.parseInt(input.charAt(i) + "");
            int digitFactorial = 1;

            for (int j = 2; j <= currentDigit; j++) {
                digitFactorial *= j;
            }

            factorialsSum += digitFactorial;
        }

        int num = Integer.parseInt(input);

        if (factorialsSum == num) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
