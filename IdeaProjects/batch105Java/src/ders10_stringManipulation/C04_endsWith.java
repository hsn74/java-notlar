package ders10_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {
        String str="Java her yerde guzel";
        System.out.println(str.endsWith("guzel"));
        System.out.println(str.endsWith(""));
        System.out.println(str.endsWith("Java her yerde guzel"));
        System.out.println(str.endsWith("Java"));
    }
}
