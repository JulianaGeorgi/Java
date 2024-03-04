package Fundamentals.BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class F04TimeAfter30Minutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentHour = Integer.parseInt(scanner.nextLine());
        int currentMinutes = Integer.parseInt(scanner.nextLine());

        int minutesAfter30Minutes = currentMinutes + 30;

        if (minutesAfter30Minutes >= 60) {
            minutesAfter30Minutes = minutesAfter30Minutes - 60;

            if (currentHour == 23) {
                currentHour = 0;
            } else {
                currentHour++;
            }
        } else if (minutesAfter30Minutes == 60) {
            minutesAfter30Minutes = 0;
        }

        System.out.printf("%d:%02d", currentHour, minutesAfter30Minutes);
    }
}
