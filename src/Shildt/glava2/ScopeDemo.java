package Shildt.glava2;
/*
Демонстрация области действия блока кода
 */

public class ScopeDemo {
    public static void main(String[] args) {
        int x; // доступна в методе main
        x = 10;
        if (x == 10) { //начало новой области действия
            int y = 20; //эта переменная доступна только в данном блоке
            // Здесь доступны и X и Y
            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        // В этом месте y не доступна а переменная x доступна
        System.out.println("x = " + x);

    }
}
