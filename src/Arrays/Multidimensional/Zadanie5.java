package Arrays.Multidimensional;
/*
На вход подаётся матрица (двумерный массив). Все элементы матрицы - целые числа.

Поверните матрице на 90 градусов по часовой стрелке.
 */

import java.util.Arrays;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;                               // Переменная количества строк
        String str = "";                             // Данный массив в 1 строке
        int length = 0;                              // Длинна Массива

        while (input.hasNext()) {                    // Считываем вводимые данные
            str += input.nextLine() + " ";           // Записываем их в строку
            String[] prom = str.split(" ");
            length = prom.length;
            total++;
        }

        String[] prom = str.split(" ");                    //Создаем строчный массив из строки
        String[][] finArr = new String[total][length / total];     //Создаеи пустой 2 мерный массив
        int total2 = 0;                                          //Переменная счета индекса в строчном массиве
        for (int i = 0; i < total; i++) {                        //Цикл строки
            for (int j = 0; j < length / total; j++) {
                finArr[i][j] = prom[total2];
                total2++;
            }
        }                                                         //создание осн массива можно было пропустить создал для наглядности

        String[][] finArrV2 = new String[length / total][total];   //Создаем новый пустой массив сопоставимый перевернутому предыдущему
        int per = length - 1;

        for (int i = length / total - 1; i >= 0; i--) {     //Забиваем новый массив значениями
            for (int j = 0; j < total; j++) {
                int per1 = per - length / total * j;
                finArrV2[i][j] = prom[per1];
            }
            per -= 1;
        }

        for (int i = 0; i < length / total; i++) {                             // Выводим масссив на печать
            for (String s : finArrV2[i]) {
                System.out.print(s == finArrV2[i][total - 1] ? s : s + " ");
            }
            System.out.println();
        }
    }
}

