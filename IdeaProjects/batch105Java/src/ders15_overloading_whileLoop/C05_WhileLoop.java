package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        /*
          Kullanicidan toplanmak uzere sayi alin
          sayilarin toplami 500'e esit olur veya gecerse
          girilen sayi adedi,
          girilen sayilarin toplamini ve
          "Bu kadar yeter" yazdirin
         */
        Scanner scan = new Scanner(System.in);
        double sayi = 0;
        double toplam = 0;
        int sayac = 0;
        while (sayi < 500) {
            System.out.println("sayi gir:");
            sayi = scan.nextDouble();
            toplam += sayi;
            sayac++;
        }
        System.out.println("sayi" + sayac + "bu kadar yeter");
    }
}
