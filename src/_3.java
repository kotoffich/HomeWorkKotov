import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by kotoffich on 21.01.2017.
 */
public class _3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter line");
        String line = sc.nextLine();
        System.out.println("Enter number");
        int i = sc.nextInt();
        test3(line, i);

    }

    private static void test2(String name) {
        System.out.println("Hello " + name);

    }

    public static void test3(String line, int counter) {
        for (int i = 0; i<counter; i++){
            System.out.println(line);
        }
    }
}
