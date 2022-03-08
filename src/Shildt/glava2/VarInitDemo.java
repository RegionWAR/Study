package Shildt.glava2;

/*
Время жизни переменной
 */
public class VarInitDemo {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1; // переменная y инициализируется каждый цикл
            System.out.println("y = " + y);
            y = x;
            System.out.println("Измененное значение y = " + y);
        }
        //тут y еже не существует
    }
}
