package MathMetod.Test;

/*На вход подаётся целое число. Выведите его максимальную цифру.*/

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int polnoeChislo = Math.abs(input.nextInt());
        input.close();
        int finish = 0;
        for (int i = 1; polnoeChislo > 0; i = polnoeChislo /= 10) {

            int ost = polnoeChislo % 10;
            if (ost > finish) finish = ost;
        }
        System.out.println(finish);

    }
}
