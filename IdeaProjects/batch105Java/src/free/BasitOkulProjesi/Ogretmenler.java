package free.BasitOkulProjesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmenler {
    static Scanner scan = new Scanner(System.in);
    static Map<String, String> ogretmenlerMap = new HashMap<>();

    public static void feykOretmenEkle() {
        ogretmenlerMap.put("1234567411", "Ali,Can,1980,Matematik");
        ogretmenlerMap.put("1234567412", "Veli,Yan,1981,Fizik");
        ogretmenlerMap.put("1234567413", "Ayse,Can,1982,Kimya");
        ogretmenlerMap.put("1234567414", "Ali,San,1982,Kimya");
        ogretmenlerMap.put("1234567415", "Alp,Yan,1984,Matematik");
    }

    public static void OgretmenMenu() throws InterruptedException {
        String tercih = " ";

        do {
            System.out.println("========YILDIZ KOLEJİ========\n" +
                    "========OGRETMEN MENU========\n+" +
                    "\n" +
                    "\t 1-Ogretmenler Listesini Yazdir\t\n" +
                    "\t 2-Soyisimden Ogretmen Bulma\t\n" +
                    "\t 3-Branstan Ogretmen Bulms\n" +
                    "\t 4-Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "\t 5-Kimlik No İle Kayıt Silme \t\n" +
                    "\t A-ANAMENU\n" +
                    "\t Q-Cıkıs\n");
            tercih = scan.nextLine();
            switch (tercih) {
                case "1":
                  ogretmenListesiYazdir();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "a":
                case "A":
                    Depo.anaMenu();
                case "q":
                    case "Q":
                    break;
                default:
                    System.out.println("lutfen gecerli tercih yapiniz");

            }
        } while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void ogretmenListesiYazdir() {

        System.out.println(ogretmenlerMap);
    }

}

