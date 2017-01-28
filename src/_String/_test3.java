package _String;

/**
 * char charAt(int index)
 */
public class _test3 {
    public static void main(String[] args) {
       /* String[] auto = {"Волга", "Чайка", "Жигули"}; //задан массив строк
        String result = "В гараже стоят машины: "; //задана строка

//прибавляем к строке элементы массива
        for(int i = 0; i < auto.length; i++){
            //если элемент не последний, разделяем запятой
            if(i != auto.length-1 )
                result += auto[i] + ", ";
                //если последний, ставим после него точку
            else
                result += auto[i] + ".";
        }
//выводим результат
        System.out.print(result);*/

        String str = "Последний символ в этой строке - о";
        int last = str.length()-1;//длина строки - 1, так как отсчет начинается с 0
        char ch = str.charAt(last);
        System.out.println(ch);
    }


}
