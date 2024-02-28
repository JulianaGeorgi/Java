package PB06NestedLoops.Exercises;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        for (int currentNum = startNum; currentNum <= endNum; currentNum++) {
            String currentNumToString = Integer.toString(currentNum);

            int evenPositionSum = 0;
            int oddPositionSum = 0;

            for (int position = 0; position <= currentNumToString.length() - 1; position++) {
                int currentDigit = Integer.parseInt(currentNumToString.charAt(position) + "");
                if (position % 2 == 0) {
                    evenPositionSum += currentDigit;
                } else {
                    oddPositionSum += currentDigit;
                }
            }
            if (evenPositionSum == oddPositionSum) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
