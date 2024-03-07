package Fundamentals.DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class F02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int digitsSum = 0;

        for (int i = 0; i < input.length(); i++) {
            int currentDigit = Integer.parseInt(input.charAt(i) + "");
            digitsSum += currentDigit;
        }

        System.out.println(digitsSum);
    }
}
