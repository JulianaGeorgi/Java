package PB05WhileLoop.Lab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();

        int year = 1;
        double notesSum = 0;
        int badNotesCounter = 0;

        while (year <= 12) {

            if (badNotesCounter > 1){
                break;
            }

            double currentNote = Double.parseDouble(scanner.nextLine());

            if (currentNote < 4) {
                badNotesCounter++;
                continue;
            }

            notesSum += currentNote;
            year++;
        }

        if (badNotesCounter > 1) {
            System.out.printf("%s has been excluded at %d grade", studentName, year);
        } else {
            double averageResult = notesSum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", studentName, averageResult);
        }


    }
}
