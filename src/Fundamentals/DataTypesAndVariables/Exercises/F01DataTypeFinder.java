package Fundamentals.DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class F01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            if (isInteger(input)) {
                System.out.println(input + " is integer type");
            } else if (isFloatingPoint(input)) {
                System.out.println(input + " is floating point type");
            } else if (isBoolean(input)) {
                System.out.println(input + " is boolean type");
            } else if (isCharacter(input)) {
                System.out.println(input + " is character type");
            } else {
                System.out.println(input + " is string type");
            }

            input = scanner.nextLine();
        }
    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isFloatingPoint(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isBoolean(String input) {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }

    private static boolean isCharacter(String input) {
        return input.length() == 1;
    }
}
