package day02_dataTurleri_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C04_Scanner_IsmiBuyukHarfle {
    public static void main(String[] args) {
        //kullaniciden ismini alip buyuk harfle yazdir
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");
        String kullaniciAdi=scan.next();
        System.out.println(kullaniciAdi.toUpperCase(Locale.ROOT));
    }
}
