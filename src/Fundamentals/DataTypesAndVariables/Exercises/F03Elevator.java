package Fundamentals.DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class F03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(numOfPeople * 1.0 / capacity);

        System.out.printf("%.0f", courses);
    }
}
