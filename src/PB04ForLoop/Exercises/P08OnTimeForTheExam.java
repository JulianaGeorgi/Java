package PB04ForLoop.Exercises;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examAllMin = examHour * 60 + examMinute;
        int arrivalAllMin = arrivalHour * 60 + arrivalMinutes;

        if ((examAllMin >= arrivalAllMin) && (examAllMin - arrivalAllMin <= 30)) {
            System.out.println("On time");
            if (examAllMin - arrivalAllMin >= 1) {
                System.out.printf("%d minutes before the start", examAllMin - arrivalAllMin);
            }
        } else if (arrivalAllMin < examAllMin - 30) {
            System.out.println("Early");
            if (examAllMin - arrivalAllMin >= 60) {
                System.out.printf("%d:%02d hours before the start", (examAllMin - arrivalAllMin) / 60, (examAllMin - arrivalAllMin) % 60);
            } else {
                System.out.printf("%d minutes before the start", examAllMin - arrivalAllMin);
            }
        } else if (arrivalAllMin > examAllMin) {
            System.out.println("Late");
            if (arrivalAllMin - examAllMin >= 60) {
                System.out.printf("%d:%02d hours after the start", (arrivalAllMin - examAllMin) / 60, (arrivalAllMin - examAllMin) % 60);
            } else {
                System.out.printf("%d minutes after the start", arrivalAllMin - examAllMin);
            }
        }
    }
}
