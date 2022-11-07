package Ders09_StringManupulations;

import java.util.Locale;

public class C07_substring {
    public static void main(String[] args) {
        String str="Java gun gectikce guzelleşiyor";
        System.out.println(str.substring(5,8));
        System.out.println(str.substring(9,17));
        System.out.println(str.substring(3,7));
        String isim="huseYIN";
        isim=isim.substring(0,1).toUpperCase(Locale.ROOT)+
                isim.substring(1).toLowerCase(Locale.ROOT);//1 ve sonrasi kucuk harf
        System.out.println(isim);
        System.out.println(isim.substring(3,4));

    }
}
