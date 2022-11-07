package free;

import java.util.Scanner;

public class IfNested {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz");
        String cinsiyet = scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
//once degiskenlerden birini ana degisken sec
        if (cinsiyet.equalsIgnoreCase("kadin")) {
            if (yas < 0 || yas > 90) {
                System.out.println("yas girisi gecersiz");
        } else if (yas < 60) {
                System.out.println("Emekli olmak icin" + (60 - yas) + "yil daha calişmalisin");
        } else {
                System.out.println("emekli olabilirsin");
            }

        }else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                    if (yas < 0 || yas > 90) {
                        System.out.println("yas girisi gecersiz");
                    } else if (yas < 60) {
                        System.out.println("Emekli olmak için" + (60 - yas) + "yil daha calişmalisin");
                    } else {
                        System.out.println("emekli olabilirsin");

                    }
                }
    }
}
