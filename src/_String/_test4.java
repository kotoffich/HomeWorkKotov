package _String;

/**
 * char[]  toCharArray()
 */
public class _test4 {
    public static void main(String[] args) {
        String str = "1 000 000 000";
//преобразовываем строку в массив
        char[] chArray = str.toCharArray();
//перебираем все элементы массива
        for(int i = 0; i<chArray.length; i++){
            //находим пробел
            if(chArray[i] == ' '){
                //заменяем на точку
                chArray[i] = '.';

            }
        }
//выводим результат
        System.out.println(chArray);
    }
}
