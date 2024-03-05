package Fundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class F3Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String weekday = scanner.nextLine();

        double price = 0;

        if (typeOfGroup.equals("Students")) {
            if (weekday.equals("Friday")) {
                price = 8.45;
            } else if (weekday.equals("Saturday")) {
                price = 9.80;
            } else if (weekday.equals("Sunday")) {
                price = 10.46;
            }

            if (numOfPeople >= 30) {
                price = price * 0.85;
            }
        } else if (typeOfGroup.equals("Business")) {
            if (weekday.equals("Friday")) {
                price = 10.90;
            } else if (weekday.equals("Saturday")) {
                price = 15.60;
            } else if (weekday.equals("Sunday")) {
                price = 16;
            }

            if (numOfPeople >= 100) {
                numOfPeople = numOfPeople - 10;
            }
        } else if (typeOfGroup.equals("Regular")) {
            if (weekday.equals("Friday")) {
                price = 15;
            } else if (weekday.equals("Saturday")) {
                price = 20;
            } else if (weekday.equals("Sunday")) {
                price = 22.50;
            }

            if (numOfPeople >= 10 && numOfPeople <= 20) {
                price = price * 0.95;
            }
        }

        double totalPrice = numOfPeople * price;
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
