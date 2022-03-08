package Shildt.glava1;

/*
Программа перевода галонов в литры
 */
public class GalToLit {
    public static void main(String[] args) {
        double gallons; // объем жидкости в галлонах
        double liters; // объем жидкости в литрах

        gallons = 10; //начальное значение галонов

        liters = gallons * 3.7854; // перевод в литры

        System.out.println(gallons + " галлонам соответствует " +
                liters + " литра");
    }
}
