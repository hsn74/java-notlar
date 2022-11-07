package free;

import java.util.Scanner;

public class IfElsebolme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi = scan.nextInt();
        //sayi=40;

        if (sayi % 2 == 0 ) {  // "== 0" koymadıgın için hata almışsın hasancımmm
            System.out.println("sayi 12'de bolunur");
        } else {
            System.out.println("sayi 5'e tam bolunur");//sayı 4e bölünmez yazmalı burda cancann
        }
    }
}
