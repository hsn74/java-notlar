package Ders09_StringManupulations;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ali";
        String str3="ALI";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase("Ali Can"));

    }
}
