package _String;

/**
 * Created by kotoffich on 28.01.2017.
 */
public class _test5 {
    public static void main(String[] args) {
        String s = "www.mysite.com";
        String name = s.substring(4, s.length()-4);
        System.out.println(name); // на консоль выведет "mysite"

        String domain = s.substring(4);
        System.out.println(domain); // на консоль выведет "mysite.com"
    }
}
