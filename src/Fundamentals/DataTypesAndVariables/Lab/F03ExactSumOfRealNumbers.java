package Fundamentals.DataTypesAndVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class F03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <= count; i++) {
            BigDecimal value = new BigDecimal(scanner.nextLine());

            sum = sum.add(value);
        }

        System.out.println(sum);
    }
}
