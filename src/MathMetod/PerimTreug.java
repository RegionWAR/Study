/*На вход подаются длины двух катетов прямоугольного треугольника a и b.
Посчитайте и выведите на печать периметр этого треугольника.
Значение периметра необходимо округлить до целого (в математическом смысле, не типа int).*/

package MathMetod;

import java.util.Scanner;

public class PerimTreug {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double a = input.nextDouble(), b = input.nextDouble(), gipot = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        input.close();
        long perim = Math.round(a + b + gipot);
        System.out.print(perim * 1.0);


    }
}
