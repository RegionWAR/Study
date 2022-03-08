package Shildt.glava2;

/*
Демонстрация приведения типов
 */
public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); //double k int теряется дробная часть числа
        System.out.println("Целочисленный результат деления x / y = " + i);

        i = 100;
        b = (byte) i; // ничего не теряется так как 100 помещается в тип byte
        System.out.println("Значение b: " + b);

        i = 257;
        b = (byte) i; //информация теряется т.к. 257 не влезает в byte
        System.out.println("Значение b: " + b);

        b = 88;
        ch = (char) b;
        System.out.println("ch:" + ch);

    }
}
