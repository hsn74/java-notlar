package free.karişik;

import java.util.Scanner;

public class Switch_6_3bas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi = scan.nextInt();
        int birlerBas = sayi % 10;
        int onlarBas = (sayi%100)/10;
        int yuzlerBas=sayi/100;

        switch (yuzlerBas) {
            case 1:
                System.out.print("yüz ");
                break;
            case 2:
                System.out.print("iki yüz ");
                break;
            case 3:
                System.out.print("uc yüz ");
                break;
            case 4:
                System.out.print("dort yüz");
                break;
            case 5:
                System.out.print("bes yüz");
                break;
            case 6:
                System.out.print("alti yüz");
                break;
            case 7:
                System.out.print("yedi yüz");
                break;
            case 8:
                System.out.print("sekiz yüz");
                break;
            case 9:
                System.out.print("dokuz yüz");
                break;
        }

        switch (onlarBas) {
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
                System.out.print("kirk ");
                break;
            case 5:
                System.out.print("elli ");
                break;
            case 6:
                System.out.print("atmiş");
                break;
            case 7:
                System.out.print("yetmiş");
                break;
            case 8:
                System.out.print("seksen");
                break;
            case 9:
                System.out.print("doksan");
                break;
        }

        switch (birlerBas) {
            case 1:
                System.out.print("bir");
                break;

            case 2:
                System.out.print("iki");
                break;

            case 3:
                System.out.print("uc");
                break;

            case 4:
                System.out.print("dort");
                break;

            case 5:
                System.out.print("bes");
                break;
            case 6:
                System.out.print("alti");
                break;
            case 7:
                System.out.print("yedi");
                break;
            case 8:
                System.out.print("sekiz");
                break;
            case 9:
                System.out.print("dokuz");
                break;
            default:
                System.out.print("Lütfen 'bir', 'iki', 'üç', 'dört' veya 'beş' şeklinde ifadeler giriniz");
                break;

          }
       }
    }

