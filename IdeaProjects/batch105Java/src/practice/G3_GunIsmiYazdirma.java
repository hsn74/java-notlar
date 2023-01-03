package practice;

import java.util.Locale;
import java.util.Scanner;

public class G3_GunIsmiYazdirma {
    public static void main(String[] args) {
        /*kullanicidan gun numarasini alıp
        gün ismini yazdiran bir program yazdirma
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun sayısını giriniz:");
        System.out.println("=================ıf else cozumu===============");
        int gunSayisi=scan.nextInt();
        if(gunSayisi<=0 || gunSayisi>7)
            System.out.println("gecersiz giris yaptiniz");
        else if (gunSayisi==1) {
            System.out.println("Pazartesi");
        }
        else if (gunSayisi==2) {
            System.out.println("Sali");
        }
        else if (gunSayisi==3) {
            System.out.println("Carsamba");
        }
        else if (gunSayisi==4) {
            System.out.println("Persembe");
        }
        else if (gunSayisi==5) {
            System.out.println("Cuma");
        }
        else if (gunSayisi==6) {
            System.out.println("Cumartesi");
        }
        else
            System.out.println("Pazar");
        System.out.println("=================swıtch case cozumu===============");

        switch (gunSayisi){
        case 1:
            System.out.println("Pazartesi");
            break;

        case 2:
            System.out.println("Sali");
            break;
        case 3:
            System.out.println("Carsamba");
            break;
        case 4:
            System.out.println("Persembe");
            break;
        case 5:
            System.out.println("Cuma");
            break;
        case 6:
            System.out.println("Cumartesi");
            break;
        case 7:
            System.out.println("Pazar");
            break;
            default:
                System.out.println("gecersiz");

        }
        /*kullanicidan gun ismi al girilen gun ismine gore hafta ii vrya hafta sonu yazdırın

         */
        System.out.println("gun ismi giriniz:");//pazartesi,PAZartesi
    String gunIsmi=scan.nextLine();
    gunIsmi=gunIsmi.toLowerCase(Locale.ROOT);
    switch (gunIsmi) {
        case "pazartesi":
            System.out.println("girdiginiz gun haftaicidir.");
        case "sali":
            System.out.println("girdiginiz gun haftaicidir.");
        case "carsamba":
            System.out.println("girdiginiz gun haftaicidir.");
        case "persembe":
            System.out.println("girdiginiz gun haftaicidir.");
        case "cuma":
            System.out.println("girdiginiz gun haftaicidir.");
            break;
        case "cumartesi":
            System.out.println("girdiginiz gun haftasonudur.");
        case "pazar":
            System.out.println("girdiginiz gun haftasonudur.");
            break;
        default:
            System.out.println("gecersiz gun ismi girdiniz");
    }}}