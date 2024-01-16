package PB02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        double movieTime = Double.parseDouble(scanner.nextLine());
        double breakTime = Double.parseDouble(scanner.nextLine());

        double lunchTime = breakTime / 8.0;
        double relaxTime = breakTime / 4.0;

        double freeTime = breakTime - lunchTime - relaxTime;

        if (freeTime >= movieTime) {
            double timeLeft = Math.ceil(freeTime - movieTime);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    movieName, timeLeft);
        } else {
            double needTime = Math.ceil(movieTime - freeTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    movieName, needTime);
        }

    }
}
