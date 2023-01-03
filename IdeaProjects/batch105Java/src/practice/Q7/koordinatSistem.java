package practice.Q7;

import java.util.Scanner;

public class koordinatSistem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki tane dogal sayi giriniz");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("1. bolgede");
        } else if (x < 0 && y > 0) {
            System.out.println("2. bolgede");
        } else if (x < 0 && y < 0) {
            System.out.println("3. bolgede");
        } else if (x > 0 && y < 0) {
            System.out.println("4. bolgede");
        }else
            System.out.println("gecersiz bolge");

        }
    }

