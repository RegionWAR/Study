package Arrays.Methods;
/*
На вход подаётся натуральное число n, затем несколько целых чисел, разделённых пробелом,
а на следующей строке - натуральное число k.
Выведите k-е по счёту число по возрастанию. Если такого числа нет, выведите "Ошибка ввода".
 */

import java.util.Arrays;
import java.util.Scanner;


public class Zadanie1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ArrayLength = sc.nextInt();
        int[] array = new int[ArrayLength];

        for (int i = 0; i < ArrayLength; i++) {
            array[i] = sc.nextInt();
        }

        int K = sc.nextInt();
        sc.close();
        Arrays.sort(array);
        int count = 0; //создаем счетчик длинны нового массива
        int newArrayLength = ArrayLength;

        while (count < ArrayLength - 1) {
            if (array[count] == array[count + 1]) {
                newArrayLength--;
            }
            count++;
        }

        int[] newArray = new int[newArrayLength];//создаем новый массив, c уникальными значениями из первого массива
        int f = 0; //счетчик для финального массива
        for (int i = 0; i <= ArrayLength - 1; i++) {
            if (i == ArrayLength - 1) {
                newArray[f] = array[i];
                break;
            }
            if (array[i] == array[i + 1]) {
                continue;
            }

            newArray[f] = array[i];
            f++;

        }
        if (K <= newArrayLength && K >= 1) {
            System.out.println(newArray[K - 1]);
        } else {
            System.out.println("Ошибка ввода");
        }


    }
}

