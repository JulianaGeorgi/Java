package Fundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class F04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reversedInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            String currentChar = input.charAt(i) + "";
            reversedInput += currentChar;
        }

        System.out.println(reversedInput);
    }
}
