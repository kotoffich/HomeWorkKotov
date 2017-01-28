package _Domashka;

import java.util.Scanner;

/**
 * 4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
 Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
 */
public class _4_1_AtHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hours");
        int i = sc.nextInt();
//        test(i);

//    }

//    public static void test(int i) {
        if (i <= 18 && i >= 9) {
            System.out.println("Я на работе");
        }
        else if (i >= 24){
            System.out.println("Error");
        } else {
            System.out.println("Я дома");
        }

    }
}