package forMetod;

import java.util.Scanner;

public class LesenkaPovtChisl {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){ //отвечает за перенос строки
            int count = 1;
            for (int j = 1; j <= i; j++) { //отв за длинну строки
                for (int k = 1; k <= j; k++){
                    if (count <= i) System.out.print(j);
                    if (count < i) System.out.print(" ");
                    count++;
                }

            }
            if (i < n) System.out.println("");
            input.close();
        }
    }
}
