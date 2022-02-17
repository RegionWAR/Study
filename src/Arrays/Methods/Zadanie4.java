package Arrays.Methods;
/*
Дана последовательность целых чисел. Определите минимальную сумму пар элементов массива,
расстояние (разница) между индексами которых равно 2. Если таких пар нет, выведите 0.
 */

import java.util.*;

public class Zadanie4 {
    public static void main(String[] args) {
        String[] input = new Scanner(System.in).nextLine().split(" "); // Создаем строчный массив из переданных чисел
        int[] finArr = new int[input.length];                                // Создаем числовой массив длиной строчного

        for (int i = 0; i < input.length; i++) {
            finArr[i] = Integer.parseInt(input[i]);                          // Конветрируем цыфры из строки в число
        }
        int total = 0;                                                       // Переменная фин результата
        if (input.length > 2) {                                              // Вычисление возхможно только при длинне массива больше 2 чисел
            total = finArr[0] + finArr[2];                                   // Допускаем что первая пара это результат
            for (int i = 1; i < finArr.length - 2; i++) {                    // Цикл проходит массив
                int summa = finArr[i] + finArr[i + 2];
                if (summa < total) {
                    total = summa;
                }
            }
        }
        System.out.print(total);                                             // Вывод результата
    }
}
