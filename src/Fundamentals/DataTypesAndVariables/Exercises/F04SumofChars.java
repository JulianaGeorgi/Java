package Fundamentals.DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class F04SumofChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfInputs = Integer.parseInt(scanner.nextLine());;
        int sumOfChars = 0;

        for (int i = 1; i <= numOfInputs; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            sumOfChars += currentChar;
        }

        System.out.printf("The sum equals: %d", sumOfChars);
    }
}
