package practice.Q7;

import java.util.Scanner;

public class ikiTamSayininKuvveti {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("iki tane dogal sayi giriniz");
        int taban=scan.nextInt();
        int kuvvet=scan.nextInt();
        long sonuc=1;
        while (kuvvet!=0){
            sonuc*=taban;
            kuvvet--;
        }
        System.out.println(sonuc);
    }
}