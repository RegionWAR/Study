package MathMetod.Test;

/* Выведите все нечётные целые числа, находящиеся между введёнными числами
(включительно), в одной строке через пробел, в порядке возрастания.
 */
import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), temp = a;
        if (a > b) {
            a = b;
            b = temp;
        }

        for (int i = a; i <= b; i++) {
            System.out.print(i + "aaa");
            //if ((i == 1 || i == (-1)) && i != b) System.out.print(i + " ");
            //if ((i == 1 || i == (-1)) && i == b) System.out.print(i);
            //if (i != b && i != (b - 1) && (i % 2) != 0) System.out.print(i + " ");
            if ((i % 2) == 1 || (i % 2) == -1) System.out.print(i + " ");
            //if ((i == b || i == (b - 1)) && (i % 2) != 0) System.out.print(i);
        }

    }
}
