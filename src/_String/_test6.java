package _String;

/**
 * Created by kotoffich on 28.01.2017.
 */
public class _test6 {
    public static void main(String[] args) {
        String isbn = "978-3-16-148410-0";
        String[] isbnParts = isbn.split("-");

        System.out.println("префикс EAN.UCC: " + isbnParts[0]);
        System.out.println("номер регистрационной группы: " + isbnParts[1]);
        System.out.println("номер регистранта: " + isbnParts[2]);
        System.out.println("номер издания: " + isbnParts[3]);
        System.out.println("контрольная цифра: " + isbnParts[4]);
    }
}
