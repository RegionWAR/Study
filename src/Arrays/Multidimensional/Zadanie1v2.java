package Arrays.Multidimensional;
/*
Два индийских программиста, Махатма и Джавахарлал, вдруг обнаружили,
что таблица умножения иногда весьма полезна для программистов,
и решили её выучить. Помогите нашим индийским друзьям!
На вход подаются числа n и m. Выведите таблицу умножения n * m (см. пример).
 */

import java.util.Scanner;

public class Zadanie1v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();            //Считываем значение переменных
        input.close();                                           //Закрываем сканер
        int[][] arr = new int[n][m];                             //Создание 2мерного массива размером n строк и m столбцов
        for (int i = 0; i < n; i++) {                             //Расчет значения строки
            for (int j = 0; j < m; j++) {                        //расчет позиции в строке
                arr[i][j] = (i + 1) * (j + 1);
                System.out.print(arr[i][j] + (j < m - 1 ? " " : "\n"));
            }
        }
    }
}
