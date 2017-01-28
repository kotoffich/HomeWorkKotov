package _Domashka;

import java.util.Scanner;

/**
 * 4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
 */
public class _4_6_Diapason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A = ");
        int num1 = sc.nextInt();
        System.out.println("B = ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        if (sum >= 11 && sum <= 19) {
            System.out.println(sum);
        } else {
            System.out.println("TRY AGAIN");
        }
    }
}
