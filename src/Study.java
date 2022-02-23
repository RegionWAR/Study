import java.util.*;
public class Study {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = 1;
        while (in.hasNext()) a *= in.nextInt();
        System.out.print(a);
    }
}
