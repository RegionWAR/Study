package Char;

import java.util.*;

public class IsItANumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print(Character.isDigit(in.nextLine().charAt(0))? "yes": "no");
        in.close();
    }
}
