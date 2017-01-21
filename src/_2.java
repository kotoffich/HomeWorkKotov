/**
 * Created by kotoffich on 21.01.2017.
 */
public class _2 {
    public static void main(String[] args) {
        String name = "Kotov";

        sayHello(name);

        int result = increment(1);

        for (int i = 0; i<10; i++) {
        }
    }

    private static int increment(int i) {
        return i+1;
    }

    private static void sayHello(String nameForHello) {
        System.out.println("Hello" + nameForHello);

    }
}
