package Basics.PB06NestedLoops.Lab;


public class P01Clock {

    public static void main(String[] args) {

        for (int hour = 0; hour <= 23; hour++) {
            for (int minutes = 0; minutes <= 59; minutes++) {
                System.out.println(hour + ":" + minutes);
            }
        }
    }
}
