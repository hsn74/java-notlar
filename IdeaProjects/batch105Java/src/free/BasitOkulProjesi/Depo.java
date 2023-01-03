package free.BasitOkulProjesi;

import java.util.Scanner;

public class Depo {
    static Scanner scan = new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {
        String tercih = "";
        do {
            System.out.println(
                    "\t 1-okul bilgilerini goruntule\n" +
                    "\t " +
                    "Q-Cıkıs\n");
            System.out.println("lütfen menuden tercih yapiniz");
            tercih = scan.nextLine();
            switch (tercih) {
                case "1"://menu bilgileri
                    Depo.okulBilgileriniYazdir();
                    break;
                case "2"://ogretmen menu
                    Ogretmenler.OgretmenMenu();
                    break;
                case "3"://ogrenci menu
                    break;
                case "q"://cıkıs
                    break;
                case "Q"://cıkıs
                    break;
                default:
                    System.out.println("lutfen gecerli bir tercih giriniz");

            }
        }while (!tercih.equalsIgnoreCase("q"));

        Depo.projeDurdur();
    }

    public static void projeDurdur() {
        System.out.println("okul projenizden cıktınız");
    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("======YILDIZ KOLEJİ======\n" +
                "\t\t Adres:"+Okul.adres+
                "\t\t\t Telefon:"+Okul.telefon );
        Thread.sleep(5000);
    }
    }
