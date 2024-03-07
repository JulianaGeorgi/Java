package Fundamentals.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class F08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);

        // 1
        /*if (Character.isUpperCase(symbol)) {
            //главна буква
            System.out.println("upper-case");
        } else {
            //малка буква
            System.out.println("lower-case");
        }*/

        // 2

        int code = (int) symbol;
        if (code >= 97 && code <= 122) {
            System.out.println("lower-case");
        } else if (code >= 65 && code <= 90) {
            System.out.println("upper-case");
        }
    }
}
