package Massiv;
/*
На вход подаётся целое число n > 1. Сформируйте массив чётных чисел от 2 до n (включительно).

Выведите на печать массив в одной строке, через пробел.

Посчитайте и выведите на печать сумму элементов массива.
 */

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), a = 0, b = 0;
        int[] massiv = new int[n];
        for (int i = 2; i <= n; i += 2) {
            massiv[a] = i;
            if (i != n && i != (n - 1) ) System.out.print(i + " ");
            else System.out.print(i);
            b += i;
            a++;
        }
        System.out.println("\n" + b);

    }
}
