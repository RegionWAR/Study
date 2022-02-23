package Char;

import java.util.Arrays;
import java.util.Scanner;

public class Ip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split("\\.");
        int total = 0;
        if (arr.length != 4) System.out.print("NO");
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].isEmpty()) continue;
                if (Integer.parseInt(arr[i]) < 256 && Integer.parseInt(arr[i]) >= 0) total++;
            }
            System.out.print(total == 4? "YES": "NO" );
        }
        in.close();
    }
}
