package Arrays.Str;

import java.util.Scanner;

public class RemoveExcess {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[] line = in.nextLine().toCharArray();
        for (int i = 0; i < line.length; i++){
            if (Character.isLetter(line[i])) System.out.print(line[i]);
            if (Character.isDigit(line[i])) System.out.print(line[i]);
            Character s = line[i];
            if (s.equals(' ')) System.out.print(line[i]);
        }
        in.close();
    }
}
