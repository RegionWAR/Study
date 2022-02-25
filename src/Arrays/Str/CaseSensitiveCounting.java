package Arrays.Str;

import Char.Str;

import java.util.Scanner;

public class CaseSensitiveCounting {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[] line = in.nextLine().toCharArray();
        int total = 0;
        for (int i = 0; i < line.length; i++){
            Character f = 'f';
            Character l = line[i];
            if (f.equals(l)) total++;
        }
        System.out.print(total);

    }
}
