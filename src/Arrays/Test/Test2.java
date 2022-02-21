package Arrays.Test;
/*
На ввод подаётся последовательность целых чисел. Выведите те из них,
которые встречаются в последовательности только один раз.
Числа нужно вывести в одной строке, через пробел, в том же порядке, как они поступили на ввод.
 */

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split(" ");
        int[] arr2 =  new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr2[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr2[i] == arr2[j]) total++;
            }
            if (total == 1) System.out.print(arr2[i] +" ");
            total = 0;
        }

    }
}
