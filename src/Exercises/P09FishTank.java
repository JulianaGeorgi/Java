package Exercises;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double fishTankVolumeInLiters = (length * width * height) * 0.001;
        double neededLiters = fishTankVolumeInLiters * (1 - percentage /100);

        System.out.println(neededLiters);
    }
}
