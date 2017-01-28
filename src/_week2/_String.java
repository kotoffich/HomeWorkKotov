package _week2;

import java.util.Scanner;

/**
 * Created by kotoffich on 28.01.2017.
 */
public class _String {
    public static void main(String[] args) {

        System.out.println("Enter value to test converter");

        Scanner scanner = new Scanner(System.in);

        String bin = toBin(scanner.nextLong());
        System.out.println(bin);

        long dec = toDec(bin);
        System.out.println(dec);
    }

    public static String toBin(long value) {
        String binary = "";
        int counter = 1;
        while (value != 0) {
            binary += value % 2 == 1 ? "1" : "0";
            if (counter == 4) {
                binary += " ";
                counter = 0;
            }
            value /= 2;
            counter++;
        }

        return new StringBuffer(binary).reverse().toString();
    }

    public static long toDec(String binary) {
        char[] values = new StringBuffer(binary).reverse().toString().toCharArray();
        long result = 0;
        int pow = 0;
        for (int i = 0; i < values.length; i++) {
            if(values[i]==' '){
                continue;
            } else if (values[i] == '1') {
                result += Math.pow(2, pow);
            }
            pow++;
        }
        return result;
    }

}