package PB04ForLoop.Exercises;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;

            if (currentNum > maxNumber) {
                maxNumber = currentNum;
            }
        }

        int sumWithoutMaxNum = sum - maxNumber;

        if (sumWithoutMaxNum == maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumWithoutMaxNum);
        } else {
            int diff = Math.abs(sumWithoutMaxNum - maxNumber);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
