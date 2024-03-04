package Basics.PB01FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P02RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.nextLine());

        System.out.println(radians * 180 / Math.PI);
    }
}
