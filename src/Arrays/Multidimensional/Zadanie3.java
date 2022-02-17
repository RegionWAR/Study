package Arrays.Multidimensional;

import java.util.*;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while (sc.hasNext()) {
            String[] Arr = sc.nextLine().split(" ");
            b = Arr.length;
            a++;
        }
        System.out.println("Строк: " + a);
        System.out.print("Столбцов: " + b);
    }
}

