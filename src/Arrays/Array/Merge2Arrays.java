package Arrays.Array;
/**
 * Merges two given sorted arrays into one
 */

import java.util.Arrays;
import java.util.Scanner;

public class Merge2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a1S = sc.nextLine().split(" ");
        String[] a2S = sc.nextLine().split(" ");
        int[] a1 = new int[a1S.length];
        int[] a2 = new int[a2S.length];
        for (int i = 0; i < a1.length; i++) a1[i] = Integer.parseInt(a1S[i]);
        for (int i = 0; i < a2.length; i++) a2[i] = Integer.parseInt(a2S[i]);
        int[] a1a2 = new int[a1.length + a2.length];
        System.arraycopy(a1,0,a1a2,0,a1.length);
        System.arraycopy(a2,0,a1a2,a1.length,a2.length);
        Arrays.sort(a1a2);
        for (int s : a1a2){
            System.out.println(s);

        }
    }
}
