package PB06NestedLoops.Lab;

import java.util.Scanner;

public class P03Combinations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int combinationsCounter = 0;

        for (int i = 0; i <= n; i++) {
            for (int y = 0; y <= n; y++) {
                for (int z = 0; z <= n; z++) {
                    int sum = i + y + z;
                    if (sum == n) {
                        combinationsCounter++;
                    }
                }
            }
        }

        System.out.println(combinationsCounter);
    }
}
