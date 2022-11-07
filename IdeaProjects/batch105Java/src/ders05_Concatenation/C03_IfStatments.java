package ders05_Concatenation;

import java.util.Scanner;

public class C03_IfStatments {
    public static void main(String[] args) {
        //kullanicidan ikisayi al eger birinci sayi 100den büyük ise ilk sayi 100den büyük yazıdr
        // eger ikinci sayi cift ise ikinci sayi cift yazdir
        // eger ilk sayi ikinci sayidan büyük ise ilk sayi daha büyüktür
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        if (s1 > 100) {
            System.out.println("ilk sayi 100'den büyük ");

        }

            if (s2 % 2 == 0) {
                System.out.println("ikinci sayi cift yazdir");
            }

                if (s1 > s2) {
                    System.out.println("ilk sayi daha büyük");
                }
            }
        }

