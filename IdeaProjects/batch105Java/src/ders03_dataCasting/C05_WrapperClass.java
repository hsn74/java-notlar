package ders03_dataCasting;

import java.sql.SQLOutput;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String str="Java cok guzel";
        char krk='b';
        Character krkWrapper='c';
        System.out.println(Character.isLetter(5));

        String str1="123";
        String str2="12";
        System.out.println(str1+str2);
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));
        // Integer.parcelInteger(str) icine yazılan str rakamlardan olusuyorsa str int a cevirir.
        //" "+ str ye cevirir.
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
    }
}
