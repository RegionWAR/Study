package Char;
/*
Вася написал книгу рецептов для своего лучшего друга Коли, но забыл, что у него аллергия на один из продуктов.
Тогда Вася решил заменить этот продукт на некоторый другой. Вася не хочет переписывать всю книгу, поэтому помогите
ему написать программу, которая сделает это за него.
 */

import java.util.Scanner;

public class Replacement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String allergy = in.nextLine(), replacment = in.nextLine(), book = in.nextLine();
        String replBook = book.replace(allergy, replacment);
        System.out.print(replBook);
    }
}
