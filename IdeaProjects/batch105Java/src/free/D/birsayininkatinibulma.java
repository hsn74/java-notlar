package free.D;

import java.util.Scanner;

public class birsayininkatinibulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("100'den kucuk bir tamsayi giriniz: ");
        int a = scan.nextInt();
        if (a < 100 && a > 0) {
            for (int i = 1; i < a; i++) {    //5
                System.out.print(i + ",");// 1, 2, 3, 4
            }
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.print("Java guzeldir");
            } else if (a % 3 == 0) {
                System.out.println("Java");
            } else if (a % 5 == 0) {
                System.out.println("Guzeldir");
            }

        } else {
            System.out.println("Gecersiz Sayi");
        }
    }
}
