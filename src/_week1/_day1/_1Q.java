package _week1._day1;

/**
 * Created by kotoffich on 21.01.2017.
 */
public class _1Q {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 5;
        int b = 10;
        int result = sum(a,b);

        int result1 = sum(result, 100);

        System.out.println(result1);
    }

    public static int sum (int a, int b){
        int a1 = a;
        int b1 = b;
        return a1+b1;
    }
}
