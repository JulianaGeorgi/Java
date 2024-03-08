package Fundamentals.DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class F10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialPokePower = Integer.parseInt(scanner.nextLine()); // N
        int distance = Integer.parseInt(scanner.nextLine()); // M
        int exhaustionFactor = Integer.parseInt(scanner.nextLine()); // Y

        int pokeCount = 0;
        int currentPokePower = initialPokePower;

        while (currentPokePower >= distance) {
            currentPokePower -= distance;
            pokeCount++;

            if (currentPokePower == initialPokePower * 0.5) {
                if (exhaustionFactor != 0) {
                    currentPokePower /= exhaustionFactor;
                }
            }
        }

        System.out.println(currentPokePower);
        System.out.println(pokeCount);
    }
}
