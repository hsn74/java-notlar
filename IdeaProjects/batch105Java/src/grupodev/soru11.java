package grupodev;

import java.util.Scanner;

public class soru11 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int sayi, kalan = 0;
            System.out.println("sayi gir: ");
            sayi = scan.nextInt();

            while (sayi > 1) {

                if (sayi % 2 == 0) {
                    System.out.println("ikiye bölünür");
                } else {
                    kalan = 1;
                    break;
                }
                sayi = (sayi / 2);
            }
            if (kalan==0) {
                System.out.println("2nin kuvveti");
            } else {
                System.out.println("2nin kuvveti değil");
            }
        }

    }