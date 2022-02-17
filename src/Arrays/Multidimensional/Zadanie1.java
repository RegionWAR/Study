package Arrays.Multidimensional;
/*
Два индийских программиста, Махатма и Джавахарлал, вдруг обнаружили,
что таблица умножения иногда весьма полезна для программистов,
и решили её выучить. Помогите нашим индийским друзьям!
На вход подаются числа n и m. Выведите таблицу умножения n * m (см. пример).
 */

import java.util.*;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();            //Считываем значение переменных
        input.close();                                           //Закрываем сканер
        for (int i = 1; i <= n; i++) {                            //Цикл отвечающий за кол-во строк
            int[] array = new int[m];                            //Создаем массив для значений строки
            for (int j = 1; j <= m; j++) {                        //Цикл заполнения массива значениями
                array[j - 1] = i * j;
            }
            for (int s : array) {                                  //Печать результата строки без пробела в конце посл символа
                if (s == array[m - 1]) System.out.println(s);
                else System.out.print(s + " ");
            }
        }
    }
}
