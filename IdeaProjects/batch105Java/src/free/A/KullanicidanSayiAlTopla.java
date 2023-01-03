package free.A;

import java.util.Scanner;

public class KullanicidanSayiAlTopla {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       int sayi=1;
       int toplam=0;
        int sayac=0;
        while (sayi!=0){
            sayi=scan.nextInt();
            System.out.println("lütfen sayi gir"+"\n bitirmek için 0 a bas" );

        }
        if(sayi!=0){
            sayac++;
            toplam+=sayi;
            }
        System.out.println("sayi"+sayac+"toplam:"+toplam);
        }

    }



