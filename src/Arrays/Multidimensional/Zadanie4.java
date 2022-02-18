package Arrays.Multidimensional;

/*
На вход подаётся матрица (двумерный массив). Все элементы матрицы - целые числа.
Напечатайте главную диагональ матрицы в одной строке, через пробел.

import java.util.Scanner;

class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        System.out.print(str[0]);
        for (int i = 1; i < str.length && sc.hasNext(); i++) {
            str = sc.nextLine().split(" ");
            System.out.print(" " + str[i]);
        }
    }
}
 */

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int length = 0;
        String proStr = "";
        while (sc.hasNext()) {
            String[] arr = sc.nextLine().split(" ");
            if (total < arr.length) {
                proStr += arr[total] + " ";
                length = arr.length;
                total++;
            } else continue;
        }
        String[] finArr = proStr.split(" ");
        for (int i = 0; i < total; i++) {
            if (i == length - 1) {
                System.out.print(finArr[i]);
            } else System.out.print(finArr[i] + " ");
        }
    }
}

