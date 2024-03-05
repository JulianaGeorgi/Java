package Fundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class F08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {
            for (int num = 1; num <= row; num++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
