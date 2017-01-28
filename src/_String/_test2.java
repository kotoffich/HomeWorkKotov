package _String;

/**
 * Created by kotoffich on 28.01.2017.
 */
public class _test2 {
    public static void main(String[] args) {
        String[] animals = {"Хаски","Морж"};// массив строк 1
        String[] food = {"колбаски","корж"}; // массив строк 2

//составляем строки из элементов массивов и связующего слова
        String result1 = animals[0].concat(" eat ").concat(food[0]);
        String result2 = animals[1].concat(" eat ").concat(food[1]);

//выводим на консоль
        System.out.println(result1);
        System.out.println(result2);


        String str = "Строка из букв, цифр 4 и специальных символов %*;№?";
        int length = str.length();
        System.out.println("Длина строки = " + length);




    }



}

