package _Domashka;

import java.util.Scanner;

/**
 * 4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат
 * деления (целую часть от деления  и остачу)
 * в другом случае выводим false и показываем результат деления (целую часть от деления и остачу)
 */
public class _4_7_TwoNumDel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A = ");
        int num1 = sc.nextInt();
        System.out.println("B = ");
        int num2 = sc.nextInt();

        int remainder = num1 % num2;
        int integerPart = num1 / num2;

//        System.out.println((remainder == 0) + ", integer = " + integerPart + ", remainder = " + remainder);


        if (remainder == 0) {
            System.out.println(true + ", integer = " + integerPart + ", remainder = " + remainder);
        } else {
            System.out.println(false + ", integer = " + integerPart + ", remainder = " + remainder);
        }

    }
}
