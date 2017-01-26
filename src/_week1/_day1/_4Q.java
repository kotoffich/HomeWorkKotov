package _week1._day1;

import java.util.Scanner;

/**
 * Created by kotoffich on 21.01.2017.
 */
public class _4Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hours");
        int i = sc.nextInt();
        test(i);

    }

    public static void test(int i) {
        if (i<=18)   {
            if (i>=9){

                System.out.println("Я на работе");
            } else{
                System.out.println("Я дома");
            }

        }
        else {
            System.out.println("Я дома");
        }
        test2(i);
    }

    public static void test2(int i) {
        if (i==50){

            System.out.println("HELLO");
        }

    }
}
