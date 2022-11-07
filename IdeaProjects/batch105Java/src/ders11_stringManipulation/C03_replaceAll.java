package ders11_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str="J1ava2 G9uzel5dir8";
        System.out.println(str.replaceAll("\\d",""));
        System.out.println(str.replaceAll("\\D",""));
        String s1="ilk urun fiyati:1250 tl";
        String s2="ikinci urun fiyati:1500 tl";
        s1=s1.replaceAll("\\D","");
        s2=s2.replaceAll("\\D","");
        System.out.println(s1+s2);
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
    }
}
