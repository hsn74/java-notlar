package ders14_methodOlusturma;

import java.util.Locale;

public class C04_methodOlusturma {
    public static void main(String[] args) {
        // parametre olarak bir String kabul edip
        // String'in terse cevrilmis halini döndüren bir method olusturun


        String input= "java kod yazdikca ogrenilir";

            System.out.println(stringiTerseCevir(input));


        }

        public static String stringiTerseCevir(String input){

            String tersStr="";

            for (int i = input.length()-1; i >=0 ; i--) {

                tersStr= tersStr+input.charAt(i);
            }
            return tersStr;

        }     }