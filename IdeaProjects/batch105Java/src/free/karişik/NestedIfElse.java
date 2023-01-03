package free.karişik;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz");
        String cinsiyet=scan.nextLine();

        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        if(yas<0 || yas>90) {
            System.out.println("girilen yas gecersiz");
        }else if (!cinsiyet.equalsIgnoreCase("kadin")|| cinsiyet.equalsIgnoreCase("erkek")) {
            System.out.println("girilen cinsiyet gecersiz");
        }else if(cinsiyet.equalsIgnoreCase("kadin")&&yas<60) {
            System.out.println("emekli olmak icin:" + (60 - yas) + "kadar calısmalısın");
        }else if(cinsiyet.equalsIgnoreCase("erkek")&& yas>65){
        }

    }
}
