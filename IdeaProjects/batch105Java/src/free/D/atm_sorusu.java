package free.D;

import java.util.Scanner;

public class atm_sorusu {
    public static void main(String[] args) {
        /*
         * ATM Kullaniciya giris icin kart numarasi ve sifresini isteyin, eger herhangi
         * birini yanlis girerse tekrar isteyin. Kart numarasi aralarda bosluk ile
         * girerse de eger dogruysa kabul edin. Kart numarasi ve sifre dogrulanirsa
         * kullanicinin yapabilecegi islemleri ekrana yazdirin,
         *
         * Bakiye sorgula, para yatirma, para cekme, para gonderme, sifre degistirme ve
         * cikis.
         *
         * Para cekme ve para gonderme isleminde mevcut bakiyeden buyuk para cekilemez,
         * Para gonderme isleminde istenen iban TR ile baslamali ve toplam 26 karakterli
         * olmali, eger degilse menu ekranina geri donsun. Sifre degistirme isleminde
         * mevcut sifreyi teyit ettikten sonra, sifre degisiklik islemini yapmali,
         */


                Scanner scan = new Scanner(System.in);

                int bakiye = 100;

                System.out.println("Bakiyeniz = " + bakiye);
                System.out.println("\n****İSLEMLER****\n");
                System.out.println("1. Para Çekme");
                System.out.println("2. Para Yatırma");
                System.out.println("3. Bakiye sorgulama");
                System.out.println("4. Kart İade");

                System.out.print("İsleminizi Seciniz: ");
                int islem = scan.nextInt();

                switch(islem) {
                    case 1:
                        System.out.println("Bakiyeniz = " + bakiye);
                        System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                        int tutar = scan.nextInt();
                        if(tutar > bakiye) {
                            System.out.print("Yetersiz bakiye. Tekrar giriniz: ");
                            tutar = scan.nextInt();
                        }
                        bakiye -= tutar;
                        System.out.println("Yeni bakiyeniz = " + bakiye);
                        break;
                    case 2:
                        System.out.println("Bakiyeniz = " + bakiye);
                        System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                        tutar = scan.nextInt();
                        bakiye += tutar;
                        System.out.println("Yeni bakiyeniz = " + bakiye);
                        break;
                    case 3:
                        System.out.println("Bakiyeniz = " + bakiye);
                        break;
                    case 4:
                        System.out.println("Kartınızı almayı unutmayınız.!!");
                    default:
                        System.out.println("Yanlıs islem secitiniz. Tekrar giriniz.");
                }
            }
        }
