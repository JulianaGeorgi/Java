package PB04ForLoop.Exercises;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double expenses = 0;
        String destination = "";
        String accommodationType = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    expenses = budget * 0.3;
                    break;
                case "winter":
                    expenses = budget * 0.7;
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    expenses = budget * 0.4;
                    break;
                case "winter":
                    expenses = budget * 0.8;
                    break;
            }
        } else {
            destination = "Europe";
            expenses = budget * 0.9;
        }

        if (destination.equals("Europe") || season.equals("winter")) {
            accommodationType = "Hotel";
        } else {
            accommodationType = "Camp";
        }

        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", accommodationType, expenses);
    }
}
