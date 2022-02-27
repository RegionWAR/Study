package Char;
/*
Вася из задачи на слайде 9 решил улучшить алгоритм. Что если у человека есть аллергия не на один,
а на несколько продуктов? да и держать книгу как одну большую строку не очень удобно.
Помимо всего прочего, непривычно видеть текст без заглавных букв.  Помогите Васе улучшить алгоритм.
 */

import java.util.Locale;
import java.util.Scanner;

public class Replacement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int line = Integer.parseInt(in.nextLine());                   //BOOKS
        String[] books = new String[line];
        for (int i = 0; i < books.length; i++){
            books[i] = in.nextLine();
        }

        int lineAllergy = Integer.parseInt(in.nextLine());            //replacements
        String[][] allergy = new String[lineAllergy][];
        for (int i = 0; i < lineAllergy; i++){
            allergy[i] = in.nextLine().toLowerCase().split(" - ");
        }

        String[][] allergyUp = new String[lineAllergy][2];            //Replacements
        for (int i = 0; i < lineAllergy; i++){
            for (int j = 0; j < 2; j++){
                allergyUp[i][j] = allergy[i][j].substring(0, 1).toUpperCase() + allergy[i][j].substring(1);
            }
        }
        for (int i = 0; i < books.length; i++){                       //replacement books
            for (int j = 0; j < lineAllergy;j++){
                books[i] = books[i].replace(allergy[j][0], allergy[j][1]);
            }
        }
        for (int i = 0; i < books.length; i++){                       //Replacement books
            for (int j = 0; j < lineAllergy; j++){
                books[i] = books[i].replace(allergyUp[j][0], allergyUp[j][1]);
            }
        }


        for (int i = 0; i < books.length; i++){                        //Finish
            System.out.print(books[i] + "\n");
        }
        in.close();

    }
}
