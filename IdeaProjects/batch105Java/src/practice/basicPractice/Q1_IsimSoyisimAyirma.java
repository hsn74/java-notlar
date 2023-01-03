package practice.basicPractice;

import java.util.Scanner;

public class Q1_IsimSoyisimAyirma {
    //tek seferde alacagınız 2 kelimelik ad soyadı 2 ayrı kelime ye ayırın
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isim yaz");
        String adSoyad=scan.nextLine();
       String ad=adSoyad.substring(0,adSoyad.indexOf(" "));
       String soyad=adSoyad.substring(adSoyad.indexOf(' ')+1);
        System.out.println("ad:"+ ad);
        System.out.println("soyad:"+ soyad);
    }
}
