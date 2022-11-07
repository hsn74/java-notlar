package ders11_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {
        String str="Java candir";
        System.out.println(str.replace("a","A"));
        System.out.println(str.replace(' ' , '_'));
        System.out.println(str.replace("candir", "cok guzeldir."));
        System.out.println(str.replace(" ", ""));
        System.out.println(str.replace("a",""));
        System.out.println(str.replace("Java","Hava"));
        //sadece 1.a yi A yapin
        System.out.println(str.replaceFirst("a","A"));
        System.out.println(str.replace("","_"));
}
}