package ders13_nestedForLoop;

import java.util.Scanner;

public class C08_MethodOlusturma {
    public static void main(String[] args) {
        //kullanicidan 2 sayi al toplamını yazdıran bir method olustur
        isteToplaYazdir();

    }
    public static void isteToplaYazdir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi gir");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("topalm:"+(sayi1+sayi2));

    }
}
