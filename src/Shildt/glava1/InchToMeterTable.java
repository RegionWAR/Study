package Shildt.glava1;

/*
Таблица преобразования дюймов в метры
 */
public class InchToMeterTable {
    public static void main(String[] args) {
        double inch, meter;
        int count = 0;

        for (inch = 1; inch <= (12 * 12); inch++){
            meter = inch * (1 / 39.37);
            System.out.println("В " + inch + " дюйме: " + meter + " метра");

            count++;
            if (count == 12){
                System.out.println();
                count = 0;
            }
        }

    }
}
