package forMetod;

import java.util.Scanner;

public class Lesenka {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close();
        for (int i = 0; i < a; i++) {
            for (int m = 1; m <= (i + 1); m++) {
                if (m == (i + 1)) System.out.println(m);
                else System.out.print(m + " ");
            }
        }

    }
}
