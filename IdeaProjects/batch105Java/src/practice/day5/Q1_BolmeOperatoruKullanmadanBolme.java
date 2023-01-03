package practice.day5;

import java.util.Scanner;

public class Q1_BolmeOperatoruKullanmadanBolme {
     static int bolum=0;
    //kullanıcıdan bolunen ve bolen seklinde 2 sayi al
    //bolme operatoru kullanmadan yapm
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bolmek istediğiniz sayiyi yaz");
        int bolunen=scan.nextInt();
        System.out.println("lutfen bolen sayiyi yaz");
        int bolen=scan.nextInt();
        System.out.println (bolunen);
        System.out.println(bolen);
        System.out.println(bol(bolunen,bolen));
    }
    public static boolean bol(int bolunen, int bolen) {
        while (bolunen>=bolen){
            bolunen-=bolen;
            bolum++;
        }
        return bol(bolunen,bolen) ;
    }
}
