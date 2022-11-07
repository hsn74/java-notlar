package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        /*kullanicidan toplamak için sayi al
        0a baasarsa sayi alma işlemini bitir
        kullanicidan kac sayi girdiğini ve sonucu ogren
         */
        Scanner scan=new Scanner(System.in);
        int girilenSayi=5;
        int sayac=0;
        int toplam=0;
        while (girilenSayi!=0){
            System.out.println("lutfen sayi gir"+"\nbitirmek  0'a bas");
            girilenSayi=scan.nextInt();

            if (girilenSayi!=0){
                sayac++;
                toplam=toplam+girilenSayi;
            }
        }
        System.out.println("sayi"+sayac+"toplam:"+toplam);
    }
}
