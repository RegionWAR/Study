package Arrays.Test;
/*
Сапер
 */

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int line = in.nextInt(), column = in.nextInt(), k = in.nextInt();
        int[][] saper = new int[line][column];
        while (in.hasNext()) {                         //получение местоположения мин и прописываем 9 где есть мина
            int x = in.nextInt(), y = in.nextInt();
            saper[x - 1][y - 1] = 9;
        }
        int total = 0;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (saper[i][j] == 9) continue;


                if (j == 0 && i == 0) {                                                              //ЛЕВЫЙ УГОЛ ВЕРХНИЙ
                    if (saper[0][1] == 9) total++;
                    if (saper[1][0] == 9) total++;
                    if (saper[1][1] == 9) total++;
                    saper[0][0] = total;
                    total = 0;
                    continue;
                }
                if (i == line - 1 && j == 0) {                                                       //ЛЕВЫЙ НИЖНИЙ УГОЛ
                    if (saper[line - 1][1] == 9) total++;
                    if (saper[line - 2][0] == 9) total++;
                    if (saper[line - 2][1] == 9) total++;
                    saper[line - 1][0] = total;
                    total = 0;
                    continue;
                }
                if (i == 0 && j == column - 1) {                                                    //ПРАВЫЙ ВЕРХНИЙ УГОЛ
                    if (saper[0][column - 2] == 9) total++;
                    if (saper[1][column - 1] == 9) total++;
                    if (saper[1][column - 2] == 9) total++;
                    saper[0][column - 1] = total;
                    total = 0;
                    continue;
                }
                if (i == line - 1 && j == column - 1) {                                              //ПРАВЫЙ НИЖНИЙ УГОЛ
                    if (saper[line - 1][column - 2] == 9) total++;
                    if (saper[line - 2][column - 1] == 9) total++;
                    if (saper[line - 2][column - 2] == 9) total++;
                    saper[line - 1][column - 1] = total;
                    total = 0;
                    continue;
                }


                if (i == 0) {                                                                            //ВЕРХНЯЯ СТРОКА
                    if (saper[0][j - 1] == 9) total++;
                    if (saper[0][j + 1] == 9) total++;
                    if (saper[1][j - 1] == 9) total++;
                    if (saper[1][j] == 9) total++;
                    if (saper[1][j + 1] == 9) total++;
                    saper[0][j] = total;
                    total = 0;
                    continue;
                }
                if (i == line - 1) {                                                                      //НИЖНЯЯ СТРОКА
                    if (saper[line - 1][j - 1] == 9) total++;
                    if (saper[line - 1][j + 1] == 9) total++;
                    if (saper[line - 2][j - 1] == 9) total++;
                    if (saper[line - 2][j] == 9) total++;
                    if (saper[line - 2][j + 1] == 9) total++;
                    saper[i][j] = total;
                    total = 0;
                    continue;
                }
                if (j == 0) {                                                                             //ЛЕВЫЙ СТОЛБЕЦ
                    if (saper[i - 1][j] == 9) total++;
                    if (saper[i - 1][j + 1] == 9) total++;
                    if (saper[i][j + 1] == 9) total++;
                    if (saper[i + 1][j + 1] == 9) total++;
                    if (saper[i + 1][j] == 9) total++;
                    saper[i][j] = total;
                    total = 0;
                    continue;
                }
                if (j == column - 1) {                                                                   //ПРАВЫЙ СТОЛБЕЦ
                    if (saper[i - 1][j] == 9) total++;
                    if (saper[i - 1][j - 1] == 9) total++;
                    if (saper[i][j - 1] == 9) total++;
                    if (saper[i + 1][j - 1] == 9) total++;
                    if (saper[i + 1][j] == 9) total++;
                    saper[i][j] = total;
                    total = 0;
                    continue;
                } else {                                                      //В ЛЮБОМ МЕСТЕ МАТРИЦЫ КРОМЕ ОПИСАННЫХ ВЫШЕ
                    if (saper[i - 1][j - 1] == 9) total++;
                    if (saper[i - 1][j] == 9) total++;
                    if (saper[i - 1][j + 1] == 9) total++;
                    if (saper[i][j - 1] == 9) total++;
                    if (saper[i][j + 1] == 9) total++;
                    if (saper[i + 1][j - 1] == 9) total++;
                    if (saper[i + 1][j] == 9) total++;
                    if (saper[i + 1][j + 1] == 9) total++;
                    saper[i][j] = total;
                    total = 0;
                    continue;
                }


            }
        }

        String[][] finsap = new String[line][column];                                      //ПРИСВАИВАЕМ ЦИФРЕ 9 БУКВУ m
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (saper[i][j] == 9) finsap[i][j] = "m";
                else finsap[i][j] = Integer.toString(saper[i][j]);
            }
        }

        for (int i = 0; i < line; i++) {                                                             //ВЫВОДИМ НА ПЕЧАТЬ
            for (int j = 0; j < column; j++) {
                if (j == column - 1) System.out.println(finsap[i][j]);
                else System.out.print(finsap[i][j] + " ");
            }
        }
    }
}
