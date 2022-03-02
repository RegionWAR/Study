package forMetod;

/**
 * Calculates factorial of given <code>value</code>.
 */
import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger finish = BigInteger.ONE;
        int value =sc.nextInt();
        for (int i = 1; i <= value; i++) finish = finish.multiply(BigInteger.valueOf(i));
        System.out.println(finish);

    }
}

