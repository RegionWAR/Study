package Arrays.Str;
/*
Вводится строка, определите, каких символов в ней больше: цифр или букв? Напоминаю, что знаки препинания и пробелы,
например. не являются ни тем ни другим. Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите
"Letter". Если же их равное количество, то выведите слово "Equal".
 */

import java.util.Scanner;

public class WhoMore {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[] line = in.nextLine().toCharArray();
        int digit = 0, letter = 0;
        for (int i = 0; i < line.length; i++){
            if (Character.isDigit(line[i])) digit++;
            if (Character.isLetter(line[i])) letter++;
        }
        if (digit > letter) System.out.print("Digit");
        if (digit < letter) System.out.print("Letter");
        if (digit == letter) System.out.print("Equal");

    }
}
