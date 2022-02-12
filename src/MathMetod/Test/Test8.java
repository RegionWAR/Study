package MathMetod.Test;
/*Проверка числа на простоту*/

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int t = 0;
        for (int i = 1; n >= i; i++) {
            if ((n % i) == 0) t += 1;
        }
        if (t == 2) System.out.print("true");
        else System.out.print("false");
    }
}