package Exercises;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int timeNeeded = numberOfPages / pagesPerHour;
        int hoursPerDayNeeded = timeNeeded / days;

        System.out.println(hoursPerDayNeeded);
    }
}
