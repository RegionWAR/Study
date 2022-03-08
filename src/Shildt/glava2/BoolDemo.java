package Shildt.glava2;

/*
Демонстрация типа boolean
 */
public class BoolDemo {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("Значение b " + b);
        b = true;
        System.out.println("Значение b " + b);

        if (b) System.out.println("Эта инструкция выполняется т.к. b присвоено значение true");

        b = false;
        if (b) System.out.println("Эта инструкция не выполняется т.к. b присвоено значение false");

        //в результате сравнения получается логическое значение
        System.out.println("Результат сравнения 10 > 9: " + (10 > 9));
    }
}
