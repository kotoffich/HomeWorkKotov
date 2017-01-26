package _Domashka;

import java.util.Scanner;

/**
 * 4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
 */
public class _Del7_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new number:");
        int a = sc.nextInt();
        if (a % 7 == 0){
            System.out.println(a * 2);
        }   else {
            System.out.println("Error");
        }
    }
}
