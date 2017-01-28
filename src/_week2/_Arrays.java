package _week2;

import java.util.Scanner;

/**
 * Created by kotoffich on 28.01.2017.
 */
public class _Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");

        int[] ARR = new int[sc.nextInt()];


        for (int i = 0; i < ARR.length; i++) {
            System.out.println("Value");
            ARR[i] = sc.nextInt();
        }

        for (int i = 0; i < ARR.length; i++) {
            int a = ARR[i];
            {
                if (a % 2 == 0) {
                    System.out.println("PAIR");
                    ARR [i] = (int) Math.pow(ARR[i] , 2);
                    System.out.println(ARR [i]);

                } else {
                    System.out.println("NOT PAIR");
                }

            }
        }
    }
}

