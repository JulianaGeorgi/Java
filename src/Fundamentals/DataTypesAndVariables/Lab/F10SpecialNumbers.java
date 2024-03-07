package Fundamentals.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class F10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            int currentNumber = i;
            int digitsSum = 0;

            // Calculate the sum of digits of the current number
            while (currentNumber > 0) {
                digitsSum += currentNumber % 10;
                currentNumber /= 10;
            }

            // Check if the sum of digits is 5, 7, or 11
            boolean isSpecial = digitsSum == 5 || digitsSum == 7 || digitsSum == 11;

            if(isSpecial){
                System.out.printf("%d -> True\n", i);
            } else {
                System.out.printf("%d -> False\n", i);
            }

        }
    }
}
