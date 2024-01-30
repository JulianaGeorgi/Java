import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermenCount = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0;

        switch (season) {
            case "Spring":
                boatPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;
            case "Winter":
                boatPrice = 2600;
                break;
        }

        if (fishermenCount <= 6) {
            boatPrice *= 0.9;
        } else if (fishermenCount <= 11) {
            boatPrice *= 0.85;
        } else {
            boatPrice *= 0.75;
        }

        if (fishermenCount % 2 == 0 && !season.equals("Autumn")) {
            boatPrice *= 0.95;
        }

        double diff = Math.abs(budget - boatPrice);

        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
