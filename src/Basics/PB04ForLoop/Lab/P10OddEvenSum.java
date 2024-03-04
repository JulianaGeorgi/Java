package Basics.PB04ForLoop.Lab;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum = evenSum + currentNumber;
            } else {
                oddSum = oddSum + currentNumber;
            }
        }

        if(evenSum == oddSum){
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        } else {
            int diff = Math.abs(evenSum -oddSum);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
