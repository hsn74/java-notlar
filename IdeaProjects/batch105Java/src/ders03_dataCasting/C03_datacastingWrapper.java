package ders03_dataCasting;

import java.util.Scanner;

public class C03_datacastingWrapper {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();
        byte donusensayi = (byte) girilenSayi;
        System.out.println("girdiginiz:" + girilenSayi + "'nin donusmus hali:" + donusensayi);
    }
}



