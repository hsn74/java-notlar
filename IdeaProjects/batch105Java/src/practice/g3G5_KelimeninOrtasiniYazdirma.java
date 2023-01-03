package practice;

import java.util.Scanner;

public class g3G5_KelimeninOrtasiniYazdirma {
    public static void main(String[] args) {
        /*
        tek sayida harf iceren bir String degişkenin ortasindaki harfi
        yazdirmak için program kullan
        eger kelieme cift ise ortdaki 2 harfi yadiran metod yazdir
        or:
        input:Python
        output:th

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz: ");
        String input=scan.next();

        System.out.println(ortadakiHarfiYazdir(input));

    }

    public static String ortadakiHarfiYazdir(String input) {
        int uzunluk = input.length();
        int ortadakiIndex = uzunluk / 2;
        int baslangicIndex = ortadakiIndex - 1;
        int bitisIndex = ortadakiIndex + 1;
        if (uzunluk == 0) return "girilen format gecersiz";
        return input;
    }
}
