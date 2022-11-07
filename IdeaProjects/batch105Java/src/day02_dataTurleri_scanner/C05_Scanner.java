package day02_dataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ondalikli sayi giriniz");
        double ondalikliSayi=scan.nextDouble();
        System.out.println("lutfen tam sayi giriniz");
        int tamSayi=scan.nextInt();
        System.out.println(ondalikliSayi+tamSayi);
        System.out.println(ondalikliSayi*tamSayi);
        System.out.println(ondalikliSayi/tamSayi);

    }
}
