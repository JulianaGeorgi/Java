package Basics.PB06NestedLoops.Exercises;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int primeNumbersSum = 0;
        int compositeNumbersSum = 0;

        while (!input.equals("stop")) {
            int num = Integer.parseInt(input);

            if (num < 0) {
                System.out.println("Number is negative.");
            } else {

                boolean isPrime = true;

                for (int divisor = 2; divisor <= num - 1; divisor++) {
                    if (num % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primeNumbersSum += num;
                } else {
                    compositeNumbersSum += num;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + primeNumbersSum);
        System.out.println("Sum of all non prime numbers is: " + compositeNumbersSum);
    }
}
