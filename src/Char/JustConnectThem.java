package Char;
/*
Вводится число n, затем n строчек, которые необходимо соединить. После вводится ещё одна строка - которая должна быть
в качестве разделителя. Выведите одну строку - все введённые выше слова через разделитель.
 */

import java.util.Scanner;

public class JustConnectThem {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int line = Integer.parseInt(in.nextLine());
        String[] str = new String[line];
        for (int i = 0; i < line; i++) str[i] = in.nextLine();
        String razd = in.nextLine();
        for (int i = 0; i < str.length; i++){
            if (i == str.length -1) System.out.print(str[i]);
            else System.out.print(str[i] + razd);
        }
    }
}
