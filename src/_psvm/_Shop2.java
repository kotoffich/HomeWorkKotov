package _psvm;

import java.util.Scanner;

/**
 * Created by kotoffich on 24.01.2017.
 */
public class _Shop2 {
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
        System.out.println("Enter age");
        int age = scan.nextInt();
        System.out.println("Money?");
        double money = scan.nextDouble();
        System.out.println("Name?");
        String name = scan.nextLine();
        System.out.println("Aduld?");
        boolean adult = scan.nextBoolean();
        String milk = "Milk";
        double price = 15;

        boolean timeResult = (age >= 24 && money > 800);
        boolean moneyResult = money >= price;

        boolean finalRes = timeResult && moneyResult && adult;

        String resultMessage = name + "Did you buy " + milk + " Price " + price + "?\n" + finalRes;

        System.out.println(resultMessage);

    }
}
