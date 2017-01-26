package _Domashka;

import java.util.Scanner;

/**
 * 4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
 */
public class _ThreeDigit_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();

        System.out.println("Enter c");
        int c = sc.nextInt();

        if (a > b && a > c);{
            System.out.println("BIG " + a);}
        if (b > a && b > c);{
            System.out.println("BIG " + b);}
        if (c > a && c > b);{
            System.out.println("BIG " + c);}

    }

}
