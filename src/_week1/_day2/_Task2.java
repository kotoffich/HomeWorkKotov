package _week1._day2;

import java.util.Scanner;

/**
 * Created by kotoffich on 22.01.2017.
 */
public class _Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Shop:");
        String shop = scanner.nextLine();

        System.out.println("2.Fresh:");
        Boolean fresh = scanner.nextBoolean();

        System.out.println("3.Bottle:");
        Boolean bottle = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("4.Country:");
        String country = scanner.nextLine();

        if ((shop.equals("eco") || shop.equals("silpo")) && fresh == true && bottle == false && !country.equals("rus")){
            System.out.println("Good");
        }

        /*System.out.println("5.Exit");*/









    }
}
