package Arrays.Test;
/*
На вход подаётся целое число n,  а на следующей строке - последовательность целых чисел через пробел,

Выведите число с индексом n. Если числа с таким индексом нет, выведите "Неверный ввод".
 */

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        int i = Integer.parseInt(n);
        String[] arr = in.nextLine().split(" ");
        //System.out.println(arr.length + " " + Arrays.toString(arr));
        System.out.print((i < arr.length && i >= 0) ? arr[i] : "Неверный ввод");
    }
}
