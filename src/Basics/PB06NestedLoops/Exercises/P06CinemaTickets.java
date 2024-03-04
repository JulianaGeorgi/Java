package Basics.PB06NestedLoops.Exercises;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kidTicketsCount = 0;
        int studentTicketsCount = 0;
        int standardTicketsCount = 0;

        int totalTicketsCount = 0;

        String movieName = scanner.nextLine();

        while (!(movieName.equals("Finish"))) {
            int availSeats = Integer.parseInt(scanner.nextLine());

            totalTicketsCount = 0;

            for (int i = 0; i < availSeats; i++) {
                String type = scanner.nextLine();
                if (type.equals("End")) {
                    break;
                }

                totalTicketsCount++;
                switch (type) {
                    case "student":
                        studentTicketsCount++;
                        break;
                    case "standard":
                        standardTicketsCount++;
                        break;
                    default:
                        kidTicketsCount++;
                        break;
                }
            }

            double hall = (double) totalTicketsCount / availSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, hall);

            movieName = scanner.nextLine();
        }

        totalTicketsCount = studentTicketsCount + standardTicketsCount + kidTicketsCount;
        System.out.printf("Total tickets: %d%n", totalTicketsCount);

        double studentPercent = (100.0 / totalTicketsCount) * studentTicketsCount;
        System.out.printf("%.2f%% student tickets.%n", studentPercent);

        double standardPercent = (100.0 / totalTicketsCount) * standardTicketsCount;
        System.out.printf("%.2f%% standard tickets.%n", standardPercent);

        double kidPercent = (100.0 / totalTicketsCount) * kidTicketsCount;
        System.out.printf("%.2f%% kids tickets.", kidPercent);
    }
}