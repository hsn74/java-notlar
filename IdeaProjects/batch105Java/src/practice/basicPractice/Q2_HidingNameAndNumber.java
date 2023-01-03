package practice.basicPractice;

import java.util.Locale;
import java.util.Scanner;

public class Q2_HidingNameAndNumber {
    /*kullanicidan isim soyisim kredi karti numrasi al
    16 gijit yoksa gecersiz yaz basamakli olsun
    input:John White 1234234534561478
    Output:Name:J*** W****
    CNN :**** **** **** 1478  */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminizi yazin");
        String soyisim=scan.nextLine();
        System.out.println("lutfen 16 haneli kredikarti numaranizi yazin");
        String cnn=scan.nextLine();

        if(cnn.length()!=16) System.out.println("invalid credit card");
        else {
            isim=isim.substring(0,1).toUpperCase(Locale.ROOT)+isim.substring(1).replaceAll("\\w","*");
            soyisim=soyisim.substring(0,1).toUpperCase(Locale.ROOT)+isim.substring(1).replaceAll("\\w","*");
            cnn="**** **** **** "+cnn.substring(12);
            System.out.println("name:"+isim+"   "+soyisim+ cnn);
        }
    }


}
