package ders19_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_StringSplitMethodu {
    public static void main(String[] args) {
        String str="java gercekten cok cok guzel";
        //verilen str da kac tane e harfi var bul
        str.split("e");
        String[] eArrayi=str.split("e");
        System.out.println(Arrays.toString(eArrayi));
        System.out.println(eArrayi.length);
    }
}
