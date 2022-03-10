package Shildt.glava2;

// Нахождение простых чисел в диапазоне от 2 до 100
public class Prime {
    public static void main(String[] args) {
        int a = 0; // счетчик количества делителей

        for (int i = 2; i <= 100; i++) { // цикл чисел

            for (int j = 2; j <= i; j++) { //цикл делителей
                if (i % j == 0) a++; //при нахождении делителя прибовляем счетчик
            }

            if (a == 1) System.out.println(i + " - простое число."); //вывод если количество дел 1
            a = 0;
        }
        
    }
}
