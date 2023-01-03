package practice;

import java.util.Arrays;

public class Dorduncugun {
    public static void main(String[] args) {
        /* input:John
        output:[J,o,h,n]
        //parametre olarak String bir isim gir
        harfleri char Array olarak metod olustur.
         */
        String name="hasan";
        kelimeninharfleriArrayi("hasan");

    }
    public static void kelimeninharfleriArrayi(String input){
        char[] output=new char[input.length()];
        for (int i = 0; i <input.length() ; i++) {
            output[i]=input.charAt(i);

        }
        System.out.println("kelimeninharfleriArrayi:"+ Arrays.toString(output));
    }
}
