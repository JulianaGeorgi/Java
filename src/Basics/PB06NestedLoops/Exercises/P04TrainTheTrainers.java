package Basics.PB06NestedLoops.Exercises;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfJudges = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();

       int totalGradeCount = 0;
       double totalGradeSum = 0.00;

        while (!presentationName.equals("Finish")) {
            double currentPresentationSum = 0.00;


            for (int judge = 1; judge <= numOfJudges; judge++) {
                double currentJudgeGrade = Double.parseDouble(scanner.nextLine());
                currentPresentationSum += currentJudgeGrade;
                totalGradeCount++;
                totalGradeSum+=currentJudgeGrade;
            }

            double currentPresentationGrade = currentPresentationSum / numOfJudges;

            System.out.printf("%s - %.2f.\n", presentationName, currentPresentationGrade);

            presentationName = scanner.nextLine();
        }

        double averageGrade = totalGradeSum / totalGradeCount;

        System.out.printf("Student's final assessment is %.2f.", averageGrade);
    }
}
