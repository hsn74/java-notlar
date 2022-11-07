package free;

import java.util.Scanner;

public class RakamlarToplami {
    public static void main(String[] args) {
        System.out.println(23/5);
        System.out.println(123%10);
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 3 basamakli sayi giriniz");
        int sayi=scan.nextInt();
        int birlerBas=0;
        int rakamlarToplami=0;
        birlerBas=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBas;
        sayi=sayi/10;
        birlerBas=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBas;
        sayi=sayi/10;
        birlerBas=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBas;
        sayi=sayi/10;
        System.out.println(rakamlarToplami);


    }
}
