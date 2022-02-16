package java24.com;

import java.time.*;
import java.time.temporal.*;

public class Clock {
    public static void main(String[] args) {
        // Определить текущее время и дату
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);

        //Вывести приветствие
        if (hour < 12) {
            System.out.println("Доброе утро!\n");
        }
        else if (hour < 17) {
            System.out.println("Добрый лень!\n");
        }else {
            System.out.println("Добрый вечер!\n");
        }

        //Начало формирования строки отображающей время
        System.out.print("Сейчас: ");

        //Сколько часов
        System.out.print(hour);
        if (hour == 1 & hour == 21) System.out.print("час ");
        if ((hour >= 2 && hour <= 4) || (hour >= 22 && hour <= 24 )) System.out.print("часа ");
        else System.out.print("часов ");

        //Сколько минут
        System.out.print(minute);
        if (((minute - 1) % 10 == 0) && minute != 11) System.out.println("минута");
        if ((((minute - 2) % 10 == 0) || ((minute - 3) % 10 == 0) || ((minute - 4) % 10 == 0)) && (minute != 12) && (minute != 13) && (minute != 14)){
            System.out.println("минуты");
        }else System.out.println("минут");

        //Отображение числа месяца
        System.out.print(day + " ");

        //Название месяца
        switch (month) {
            case 1:
                System.out.print("января");
                break;
            case 2:
                System.out.print("февраля");
                break;
            case 3:
                System.out.print("марта");
                break;
            case 4:
                System.out.print("апреля");
                break;
            case 5:
                System.out.print("мая");
                break;
            case 6:
                System.out.print("июня");
                break;
            case 7:
                System.out.print("июля");
                break;
            case 8:
                System.out.print("августа");
                break;
            case 9:
                System.out.print("сентября");
                break;
            case 10:
                System.out.print("октября");
                break;
            case 11:
                System.out.print("ноября");
                break;
            case 12:
                System.out.print("декабря");
                break;
        }

        //Вывод годв
        System.out.print(", " + year + " года");

    }
}
