package _Domashka;

import java.util.Scanner;

/**
 * 4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
 */
public class _4_4_Float {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER NEW NUM: ");
        double a = sc.nextDouble();

        boolean b = (a >= 0 && a <= 1);
            System.out.println("WIN" + b);
       /* } else{
            System.out.println("FAIL");
        }

        }
        boolean a = true;*/

    }
}
