package Shildt.glava1;

/*
Демонстрация применения инструкции if
 */
public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;

        if (a < b) System.out.println("a меньше b");
        if (a == b) System.out.println("Вы не должны увидеть этот текст");

        System.out.println();

        c = a - b; //переменная с получает значение -1

        System.out.println("с содержит -1");
        if (c >= 0) System.out.println("с - не отрицательное число");
        if (c < 0) System.out.println("c - отрицательное число");

        System.out.println();

        c = b - a;

        System.out.println("с содержит 1");
        if (c >= 0) System.out.println("с - не отрицательное число");
        if (c < 0) System.out.println("c - отрицательное число");
    }
}
