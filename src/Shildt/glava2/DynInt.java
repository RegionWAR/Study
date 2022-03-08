package Shildt.glava2;

/*
Демонстрация динамической переменной
 */
public class DynInt {
    public static void main(String[] args) {
        double radius = 4, heiight = 5;

        // переменная volume инициализирована динамически
        //во время выполнеия программы
        double volume = 3.1416 * radius * radius * heiight;

        System.out.println("Объем = " + volume);
    }
}
