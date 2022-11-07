package ders10_stringManipulation;

public class C10_isEmty {
    public static void main(String[] args) {
        String str="";
        System.out.println(str.isEmpty());
        str=" ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
    }
}
