package Arrays.Str;

import java.util.Scanner;

public class CaseSensitiveNotCounting {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine().toLowerCase();
        String m = in.nextLine().toLowerCase();
        System.out.print(line.length() - line.replace( m, "").length());

    }
}
