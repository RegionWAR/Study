package Arrays.Methods;
/*
На ввод подаётся последовательность целых чисел. Поменяйте местами соседние элементы последовательности
(второй с третьим, четвёртый с пятым и т.д.), кроме первого и последнего. Если находится "одинокий" элемент,
который не с чем поменять - необходимо оставить его на месте.
 */

import java.util.*;

public class EnhancedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] array = line.split(" ");
        for (int i = 1; i < (array.length - 2); i = i + 2) {
            String a = array[i];
            array[i] = array[i + 1];
            array[i + 1] = a;
        }
        for (String s: array) System.out.print(s + " ");
    }
}
