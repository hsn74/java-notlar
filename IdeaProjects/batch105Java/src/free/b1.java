package free;

import java.util.Scanner;

public class b1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double sayi=0;
        double toplam=0;
        double sayac=0;
        while(sayi<500){
            System.out.println("sayi gir:");
            sayi=scan.nextDouble();
            toplam+=sayi;
            sayac++;
        }
        System.out.println("sayi"+sayac+"bu kadar yeter");
    }}
