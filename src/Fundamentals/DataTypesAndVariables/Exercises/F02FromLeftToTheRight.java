package Fundamentals.DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class F02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLines = Integer.parseInt(scanner.nextLine());

        for (int line = 1; line <= numOfLines; line++) {

            String input = scanner.nextLine();

            String leftSide = "";
            String rightSide = "";
            int leftSideSum = 0;
            int rightSideSum = 0;
            boolean isOnTheRight = false;

            for (int i = 0; i <= input.length() - 1; i++) {

                char currentChar = input.charAt(i);

                if (currentChar == ' ') {
                    isOnTheRight = true;
                    continue;
                }

                if (isOnTheRight) {
                    rightSide += currentChar + "";
                    if (currentChar != '-') {
                        rightSideSum += Integer.parseInt(currentChar + "");
                    }
                } else {
                    leftSide += currentChar + "";
                    if (currentChar != '-') {
                        leftSideSum += Integer.parseInt(currentChar + "");
                    }
                }
            }

            if (Long.parseLong(leftSide) > Long.parseLong(rightSide)) {
                System.out.println(leftSideSum);
            } else {
                System.out.println(rightSideSum);
            }
        }
    }
}
