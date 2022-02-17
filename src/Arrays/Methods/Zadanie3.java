package Arrays.Methods;
/*
На вход подаётся строка текста.
Определите, в каком по счёту слове этого предложения меньше всего букв,
и выведите на печать. Если таких слов несколько, выведите номер первого по порядку.
 */

import java.util.*;

public class Zadanie3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] array = input.nextLine().split(" ");
        input.close();
        int total = array[0].length();
        int pozic = 1;
        for (int i = 0; i < array.length; i++){
            if (array[i].length() < total) {
                total = array[i].length();
                pozic = i + 1;
            }
        }
        System.out.print(pozic);
    }
}
