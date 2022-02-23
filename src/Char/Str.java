package Char;

import java.util.Arrays;
import java.util.Scanner;

public class Str {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.print(str.charAt(2) + "\n" + str.charAt(str.length() - 2) + "\n");

        char[] dst0 = new char[5];
        str.getChars(0, 5, dst0, 0);
        System.out.println(dst0);

        char[] dst1 = new char[str.length() - 2];
        int end = str.length() -2;
        str.getChars(0, end, dst1, 0);
        System.out.println(dst1);

        char[] dst2 = new char[str.length() - 3];
        int end1 = str.length();
        str.getChars(3, end1, dst2, 0);
        System.out.println(dst2);

        System.out.print(str.length());

        in.close();

    }
}
