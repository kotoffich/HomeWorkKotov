package _Kot;

import java.util.Scanner;

/**
 * Created by kotoffich on 24.01.2017.
 */
public class _AtHomeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double a,b,c;

        System.out.println("Please enter number a");
        a = scan.nextDouble();
        System.out.println("Please enter number b");
        b = scan.nextDouble();
        System.out.println("Please enter number c");
        c = scan.nextDouble();

        if (a > b && a > c){
            System.out.println("The biggest number: " + a);
        }
        if (b > a && b > c){
            System.out.println("The biggest number: " + b);
        }
        if (c > a && c > b){
            System.out.println("The biggest number: " + c);
        }
        if (a < b && a < c){
            System.out.println("The smallest number: " + a);
        }
        if (b < a && b < c){
            System.out.println("The smallest number: " + b);
        }
        if (c < a && c < b){
            System.out.println("The smallest number: " + c);
        }
    }
}
