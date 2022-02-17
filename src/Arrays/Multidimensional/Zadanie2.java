package Arrays.Multidimensional;

import java.util.*;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine(); //получаем количество строк строкой
        int b = Integer.parseInt(a);
        String[][] array = new String[b][]; //Создаем массив, задав только колво строк
        for (int i = 0; i < b; i++) {
            array[i] = input.nextLine().split(" ");
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
