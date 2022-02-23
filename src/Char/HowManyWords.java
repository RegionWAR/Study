package Char;
/*
Маша и Олег играли в игру. Маша читала статьи в газете и выписывала слова, которые начинаются на её любимую букву и
заканчиваются на любимую букву её друга Олега. Олег же наоборот - слова, которые начинаются на его любимую букву и
заканчиваются на любимую букву Маши. Обратите внимание, что буквы могут быть в разных регистрах (большие/маленькие).
Определите, сколько слов выписали дети.
 */

import java.util.Scanner;

public class HowManyWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String m = in.nextLine().toLowerCase(), o = in.nextLine().toLowerCase(), str = in.nextLine().toLowerCase();
        String[] arr = str.split(" ");
        int totalM = 0, totalO = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].charAt(0) == m.charAt(0) && arr[i].charAt(arr[i].length()-1) == o.charAt(0)) totalM++;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i].charAt(0) == o.charAt(0) && arr[i].charAt(arr[i].length()-1) == m.charAt(0)) totalO++;
        }
        System.out.print(totalM + "\n" + totalO);

    }
}
