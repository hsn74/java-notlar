package free.ifElse;

import java.util.Scanner;

public class HesapMakinesi {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println(" sayi 1 gir:");
                double sayi1 = scan.nextDouble();
                System.out.println("sayi 2 gir:");
                double sayi2 = scan.nextDouble();
                System.out.println("islem sec:");
                System.out.println("islem 1 toplama");
                System.out.println("islem 2 cikarma");
                System.out.println("islem 3 carpma");
                System.out.println("islem 4 bölme");
                System.out.println("secim yap");
                int secim = scan.nextInt();
                if (secim == 1) {
                    System.out.println("toplama+=sayi1+sayi2");
                }else if (secim==2) {
                    System.out.println("cikarma+=sayi1-sayi2");
                }else if (secim==3) {
                    System.out.println("carpma+=sayi1*sayi2");
                }else if (secim==4) {
                    System.out.println("bolme+=sayi1/sayi2");
                }else{
                    System.out.println("baska islem yap");

                }

                if (secim == 1) {
                    System.out.println("Toplama= " + (sayi1 + sayi2));
                } else if (secim == 2) {
                    System.out.println("Çıkarma = " + (sayi1 - sayi2));
                } else if (secim == 3) {
                    System.out.println("Carpma = " + (sayi1 * sayi2));
                } else if (secim == 4) {
                    System.out.println("Bölme= " + (double) sayi1 / sayi2);
                } else {
                    System.out.println("Yanlıs secim yaptınız. Seciminizi kontrol ediniz.");
                }
            }
        }


