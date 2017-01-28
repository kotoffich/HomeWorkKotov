package _Domashka;

import java.util.Scanner;

/**
 * 4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.
 */
public class _4_5_SumTwoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A = ");
        int num1 = sc.nextInt();
        System.out.println("B = ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1 - num2);
        } else if (num2 > num1) {
            System.out.println(num1 + num2);
        } else if (num1 == num2) {
            System.out.println("TRY AGAIN");

        }

    }
}
