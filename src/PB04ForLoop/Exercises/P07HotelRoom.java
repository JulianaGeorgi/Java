package PB04ForLoop.Exercises;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberOfNights = Integer.parseInt(scanner.nextLine());

        double studioPrice;
        double apartmentPrice;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;
                if (numberOfNights > 14) {
                    studioPrice *= 0.7; // 30% discount for stays longer than 14 nights
                } else if (numberOfNights > 7) {
                    studioPrice *= 0.95; // 5% discount for stays longer than 7 nights
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (numberOfNights > 14) {
                    studioPrice *= 0.8; // 20% discount for stays longer than 14 nights
                }
                break;
            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                break;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }

        if (numberOfNights > 14) {
            apartmentPrice *= 0.9; // 10% discount for stays longer than 14 nights
        }

        double totalPriceForStudio = studioPrice * numberOfNights;
        double totalPriceForApartment = apartmentPrice * numberOfNights;

        System.out.printf("Apartment: %.2f lv.%n", totalPriceForApartment);
        System.out.printf("Studio: %.2f lv.%n", totalPriceForStudio);
    }
}
