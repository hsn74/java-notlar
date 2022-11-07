package ders11_stringManipulation;

import java.util.Locale;

public class C01_nullPointer {
    public static void main(String[] args) {
        String str1="";
        System.out.println(str1);
        System.out.println(str1.concat("Java"));

        String str2;
        str2="Java candir";
        System.out.println(str2);
        System.out.println(str2.concat("."));

        String str3=null;// str3 e deger atamadığımızı biliyor
        System.out.println(str3);
        str3.concat(str3.concat("Java"));
        System.out.println(str3+"Java");
        System.out.println(str3.toUpperCase(Locale.ROOT));
    }
}
