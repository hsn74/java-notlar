package free.D;

import java.util.Scanner;

public class atm1 {
    public static void main(String[] args) {;
        // /*
        //    ATM
        //Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        //Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        //Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
        //
        //Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.
        //
        //Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        //Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina
        //geri donsun.
        //Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
        //     */
        System.out.println("kart numarasi gir");
        String bakiye= String.valueOf(0);
        System.out.println("Bakiyeniz = " + bakiye);
        System.out.println("\n****İSLEMLER****\n");
        System.out.println("1. Para Çekme");
        System.out.println("2. Para Yatırma");
        System.out.println("3. Bakiye sorgulama");
        System.out.println("4. Kart İade");

    }
}
