package forMetod;

import java.util.*;

public class PovtChisl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 1;
        int z = 0;
        for (int i = 0; i < a; i++) {
            for (int c = 0; c < b; c++) {
                if (z < a)
                    System.out.print(b + (z == a - 1 ? "" : " "));
                z++;
            }
            b++;
        }

        input.close();
    }

}
