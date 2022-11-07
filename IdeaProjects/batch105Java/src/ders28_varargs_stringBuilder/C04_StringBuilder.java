package ders28_varargs_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(7);
        //bu kod yazildiginda java 7 karakter alabilecek sb olusturur.
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Java");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" guzeldir");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

    }
}
