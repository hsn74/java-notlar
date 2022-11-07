package ders10_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {
     String str="Java ile kodlama cok zevkli";
        System.out.println(str.contains("odla"));
             //CharSequense: karakter dizisi
        System.out.println(str.contains("cok"));
        System.out.println(str.contains("a"));
        System.out.println(str.contains("java"));

        String str2="java";
        System.out.println(str.contains(str2));

        String str3="234 Ali Can";
        System.out.println("234");


    }
}
