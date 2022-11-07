package day02_dataTurleri_scanner;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class ders02_dataTurleri {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1. tamsayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("lutfen 2. tamsayiyi girininiz");
        int sayi2=scan.nextInt();
        int bos;
        bos = sayi2;
        sayi2 = sayi1;
        sayi1 = bos;
        sayi1=bos;
        System.out.println("sayi1'in degeri:" + sayi1);
        System.out.println("sayi2'nin degeri: " + sayi2);

    }
}
