package Char;
/*
Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится цифра.
Определите индексы первого и последнего её вхождения.
 */

import java.util.Scanner;

public class WhoIsFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String sos = in.nextLine();
        System.out.print(str.indexOf(sos) + "\n" + str.lastIndexOf(sos));
    }
}
