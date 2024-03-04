package Basics.PB06NestedLoops.Lab;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        int numberOfRooms = Integer.parseInt(scanner.nextLine());

        for (int floor = numberOfFloors; floor >= 1; floor--) {
            for (int room = 0; room < numberOfRooms; room++) {
                if (floor == numberOfFloors) {
                    System.out.printf("L%d%d ", floor, room);
                } else if (floor % 2 == 0) {
                    System.out.printf("O%d%d ", floor, room);
                } else {
                    System.out.printf("A%d%d ", floor, room);
                }
            }
            System.out.println();
        }
    }
}
