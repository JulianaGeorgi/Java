package Fundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class F01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three numbers
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Find the highest number
        int highestNum;
        if (num1 >= num2 && num1 >= num3) {
            highestNum = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            highestNum = num2;
        } else {
            highestNum = num3;
        }

        // Find the lowest number
        int lowestNum;
        if (num1 <= num2 && num1 <= num3) {
            lowestNum = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            lowestNum = num2;
        } else {
            lowestNum = num3;
        }

        // Find the second-highest number
        int secondHighestNum;
        if (num1 != highestNum && num1 != lowestNum) {
            secondHighestNum = num1;
        } else if (num2 != highestNum && num2 != lowestNum) {
            secondHighestNum = num2;
        } else {
            secondHighestNum = num3;
        }

        // Print the numbers in descending order
        System.out.println(highestNum);
        System.out.println(secondHighestNum);
        System.out.println(lowestNum);
    }
}
