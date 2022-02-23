package Char;

public class Primer {
    public static void main(String[] args){
        String str = "Hello world!";
        int start = 6;
        int end = 11;
        char[] dst=new char[end - start];
        str.getChars(start, end, dst, 0);
        System.out.println(dst); // world
    }
}
