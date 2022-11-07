package free;

import java.util.Scanner;

public class IF_BOLUNEBILME {
    public static void main(String[] args) {
        System.out.println("lutfen bir tamsayi giriniz");
        Scanner scan = new Scanner(System.in);
        int girilenSayi = scan.nextInt();
        if (girilenSayi % 3 == 0) {
            System.out.println("uc ile tam bölünür");

        if(girilenSayi % 5==0) {
                System.out.println("bese tam bolunur");
            }
        }
      }

    }