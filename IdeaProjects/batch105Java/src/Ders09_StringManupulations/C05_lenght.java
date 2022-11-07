package Ders09_StringManupulations;

public class C05_lenght {
    public static void main (String[] args) {
        String str="Uzunkavaklaraltindayataruyumazoglu";
        System.out.println(str.length());
        System.out.println(str.charAt(33));
        System.out.println(str.charAt(str.length()-1));
        //sondan 3. karakter
        System.out.println(str.charAt(str.length()-3));

    }
}
