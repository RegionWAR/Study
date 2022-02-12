package MathMetod.Test;
/* Найти делители числа*/
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        for (int i = 1; n >= i; i++) {
            if ((n%i) == 0) System.out.print(i + " ");

        }
    }
}
