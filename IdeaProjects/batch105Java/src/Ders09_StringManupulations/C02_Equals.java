package Ders09_StringManupulations;

public class C02_Equals {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ali";
        String str3=new String("ALİ");
        String str4="Ali";
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str1.equals(str2));
    }
}
