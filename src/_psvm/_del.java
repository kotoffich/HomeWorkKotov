package _psvm;

import java.util.Scanner;

/**
 * Created by kotoffich on 25.01.2017.
 *
// * 4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
 */
public class _del {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 7 == 0) {
            System.out.println(number * 2);
        } else {
            System.out.println("Error");
        }
    }
}
