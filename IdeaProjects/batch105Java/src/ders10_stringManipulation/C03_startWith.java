package ders10_stringManipulation;

public class C03_startWith {
    public static void main(String[] args) {
        String str="manti acarken java ogrenilmez";
        System.out.println(str.startsWith("Manti"));
        System.out.println(str.startsWith("m"));
        System.out.println("manti acarken java ogrenilmez");
        System.out.println(str.startsWith(""));
        // " " hiclik olup bastan veya sondan bosluk var mı yok mu diye bak
        System.out.println(str.startsWith("manti",0));
        System.out.println(str.startsWith("java",10));
    }
}
