package PB06NestedLoops.Exercises;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int current = 1;
        boolean isBiger = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                if (current > n) {
                    isBiger = true;
                    break;
                }
                System.out.print(current + " ");
                current++;
            }
            if (isBiger) {
                break;
            }
            System.out.println();
        }
    }
}
