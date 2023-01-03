package free.karişik;

import java.util.Scanner;

public class kartvizit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isim");
        String isim=scan.nextLine();
        System.out.println("soyisim");
        String soyisim=scan.nextLine();
        System.out.println("yas");
        int yas= scan.nextInt();
        System.out.println("meslek");
        String meslek =scan.nextLine();
        System.out.println("isim:"+"soyisim:"+"yas:"+ "meslek");
    }
}
