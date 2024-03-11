package Fundamentals.DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class F11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());

        double bestSnowball = 0.0;
        int snowballSnowBiggest = 0;
        int snowballTimeBiggest = 0;
        int snowballQualityBiggest = 0;

        for (int i = 1; i <= numberOfSnowballs; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double currentSnowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);
            if (currentSnowballValue > bestSnowball) {
                bestSnowball = currentSnowballValue;
                snowballSnowBiggest = snowballSnow;
                snowballTimeBiggest = snowballTime;
                snowballQualityBiggest = snowballQuality;
            }

        }

        System.out.printf("%d : %d = %.0f (%d)", snowballSnowBiggest, snowballTimeBiggest, bestSnowball, snowballQualityBiggest);
    }
}
