package free;

import java.util.Scanner;

public class DataCasting1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sayi giriniz");
        int sayi=scan.nextInt();
        byte yeniSayi=(byte) sayi;
        System.out.println("sayi:"+yeniSayi);

    }
}
