package Class;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfDogPackages = Integer.parseInt(scanner.nextLine());
        int numOfCatPackages = Integer.parseInt(scanner.nextLine());

        double priceOfDogPackages = numOfDogPackages * 2.50;
        int priceOfCatPackages = numOfCatPackages * 4;

        System.out.println(priceOfCatPackages + priceOfDogPackages +" lv.");
    }
}
