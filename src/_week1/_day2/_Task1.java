package _week1._day2;

import java.util.Scanner;

/**
 * Created by kotoffich on 22.01.2017.
 */
public class _Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean good = false;
        while (!good){
            System.out.println("1.Main");
            System.out.println("2.Buy");
            System.out.println("3.Sell");
            System.out.println("4.Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Main");
                    good = true;
                    break;
                case 2:
                    System.out.println("Buy");
                    good = true;
                    break;
                case 3:
                    System.out.println("Sell");
                    good = true;
                    break;
                case 4:
                    System.out.println("Exit");
                    good = true;
                    break;
                default:
                    System.out.println("Error");
            }
        }



        boolean fresh;
        boolean ua;
        boolean bottle;
        boolean eco;
    }
}
