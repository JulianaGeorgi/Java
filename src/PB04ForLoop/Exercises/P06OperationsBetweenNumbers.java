package PB04ForLoop.Exercises;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        int res = 0;
        String resType = "";

        switch (operator) {
            case "+":
                res = num1 + num2;
                if (res % 2 == 0) {
                    resType = "even";
                } else {
                    resType = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", num1, operator, num2, res, resType);
                break;
            case "-":
                res = num1 - num2;
                if (res % 2 == 0) {
                    resType = "even";
                } else {
                    resType = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", num1, operator, num2, res, resType);
                break;
            case "*":
                res = num1 * num2;
                if (res % 2 == 0) {
                    resType = "even";
                } else {
                    resType = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", num1, operator, num2, res, resType);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero\n", num1);
                } else {
                    double division = num1 * 1.0 / num2;
                    System.out.printf("%d %s %d = %.2f", num1, operator, num2, division);
                }
                break;
            case "%":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero\n", num1);
                } else {
                    res = num1 % num2;
                    System.out.printf("%d %% %d = %d\n", num1, num2, res);
                }
                break;
        }
    }
}
