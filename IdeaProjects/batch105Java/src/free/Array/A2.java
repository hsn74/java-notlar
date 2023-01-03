package free.Array;

import java.util.Arrays;

public class A2 {
    public static void main(String[] args) {
        String str="Java cok guzel";
        String [] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        String [] kelimeler2=str.split("a");
        System.out.println(Arrays.toString(kelimeler2));
    }
}
