package Arrays.Array;
/*
На вход подаётся целое число n - длина последовательности,
а затем сама последовательность целых чисел. Выведите на печать
все числа, большие предыдущего числа.
 */

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int prom = 10, nm2 = 0;
        int[] massiv1 = new int[a];
        for (int i = 0; i < a; i++) massiv1[i]=sc.nextInt();
        for (int i = 0; i < a; i++){
            if (massiv1[i] > prom){
                prom = massiv1[i];
                System.out.print(prom + " ");
            } else {
                prom = massiv1[i];
            }
        }
    }
}
