package Shildt.glava1;

/*
Программа вычисляет вес на луне
 */
public class Moon {
    public static void main(String[] args) {
        double eartWeight, moonWeight;

        eartWeight = 86;

        moonWeight = eartWeight * 0.17;
        System.out.println("Ваш вес на Земле: " + eartWeight + "\n" +
                "Вош вес на Луне: " + moonWeight);
    }
}
