package Basics.PB06NestedLoops.Lab;

public class P02MultiplicationTable {
    public static void main(String[] args) {

        for (int num1 = 1; num1 <= 10; num1++) {
            for (int num2 = 1; num2 <= 10; num2++) {
                int res = num1 * num2;
                System.out.printf("%d * %d = %d%n", num1, num2, res);
            }
        }
    }
}
