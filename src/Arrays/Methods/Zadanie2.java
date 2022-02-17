package Arrays.Methods;
/*
На вход подаётся последовательность целых чисел. Создайте из этой последовательности массив чисел, отсортированный по возрастанию, и выведите на печать.
 */

import java.util.*;

public class Zadanie2 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();                 //Записываем строку с числами
        input.close();                                  //Закрываем сканер
        String[] array = line.split(" ");         //Создаем массив из строки
        int lengthArray = array.length;                 //Узнаем длинну массива
        int[] finArray = new int[lengthArray];          //Создаем 2 финальный массив
        for (int i = 0; i < lengthArray; i++) {
            finArray[i] = Integer.parseInt(array[i]);   //Заполняем массив 2 значениями из 1 массива преобразуя из строк в числа
        }
        Arrays.sort(finArray);                          //Сортируем финальный массив(2)
        System.out.println(Arrays.toString(finArray));  //Выводим массив на печать


    }
}
