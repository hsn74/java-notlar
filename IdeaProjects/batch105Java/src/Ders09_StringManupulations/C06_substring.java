package Ders09_StringManupulations;

import java.util.Locale;

public class C06_substring {
    public static void main(String[] args) {
        String str="Java ogren ,isi kap";
        System.out.println(str.substring(5));
        System.out.println(str.substring(0));
        System.out.println(str.length());
        String sonHarf=""+str.substring(str.length()-1);
        System.out.println(sonHarf);
        System.out.println(str.substring(str.length()-1).toUpperCase(Locale.ROOT));
        System.out.println(str.substring(str.length()-3).toUpperCase(Locale.ROOT));

    }
}

