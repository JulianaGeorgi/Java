package Fundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class F05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";
        int wrongPasswordsCount = 0;

        for (int i = userName.length() - 1; i >= 0; i--) {
            password += userName.charAt(i);
        }

        String input = scanner.nextLine();

        while (!input.equals(password)) {
            wrongPasswordsCount++;
            if (wrongPasswordsCount == 4) {
                System.out.printf("User %s blocked!", userName);
                return;
            }

            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }

        System.out.printf("User %s logged in.", userName);
    }
}
