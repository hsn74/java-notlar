package day02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");
        // string için kullanilabilen ilk spcade kadar olani alir.
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminizi yaziniz");
        String soyisim= scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();
        System.out.println("isminiz:"+ isim+"\nsoyisiminiz:"+soyisim+"\nyasiniz:"+yas+"\n kaydiniz basari ile tamlanmıstir:"+"kaydiniz basari ile tamamlanmıstir");






    }
}
