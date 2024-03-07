package Fundamentals.DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class F05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstCharPosition = Integer.parseInt(scanner.nextLine());
        int lastCharPosition = Integer.parseInt(scanner.nextLine());
        String concatChars = "";

        for (int position = firstCharPosition; position <= lastCharPosition; position++) {
            concatChars = concatChars + (char) position + " ";
        }
        System.out.println(concatChars);
    }
}
