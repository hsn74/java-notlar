package ders14_methodOlusturma;

public class C03_StringTerseCevirme {
    public static void main(String[] args) {
        String input="java kod yazdikca ogrenilir";
        System.out.println(stringTerseCevir(input));
        System.out.println(stringTerseCevir(input));
    }
    public static String stringTerseCevir(String input){
        String tersStr= "";
        for (int i =input.length()-1; i >=0 ; i--) {
            tersStr = tersStr+input.charAt(i);
        }
        return tersStr;
    }  }


