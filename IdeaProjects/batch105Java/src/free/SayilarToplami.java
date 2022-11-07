package free;

import java.util.Scanner;

public class SayilarToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki basamakli sayi giriniz");
        int sayi = scan.nextInt();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        birlerBasamagi= sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        sayi = sayi / 10;
        birlerBasamagi= sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        sayi = sayi / 10;
        System.out.println(rakamlarToplami);


    }
}
