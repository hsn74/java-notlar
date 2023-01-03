package free.karişik;

import java.util.Scanner;

public class Switch5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi gir");
        int rakam = scan.nextInt();
        int birlerbas = rakam % 10;
        int onlarbas = rakam / 10;
        switch (onlarbas) {
            case 1:
                System.out.print("on ");
                break;
            case 2:
                System.out.print("yirmi ");
                break;
            case 3:
                System.out.print("otuz ");
                break;
            case 4:
                System.out.println("kirk");
                break;
            case 5:
                System.out.println("elli");
                break;
            case 6:
                System.out.println("atmiş");
                break;
            case 7:
                System.out.println("yetmiş");
                break;
            case 8:
                System.out.println("seksen");
                break;
            case 9:
                System.out.println("doksan");
                break;


        }
        switch (birlerbas) {
            case 1:
                System.out.println("bir");
                break;

            case 2:
                System.out.println("iki");
                break;

            case 3:
                System.out.println("uc");
                break;

            case 4:
                System.out.println("dort");
                break;

            case 5:
                System.out.println("bes");
                break;


            default:
                System.out.println("Lütfen 'bir', 'iki', 'üç', 'dört' veya 'beş' şeklinde ifadeler giriniz");
                break;

        }
    }
}