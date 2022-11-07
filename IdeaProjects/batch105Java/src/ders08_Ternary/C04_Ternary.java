package ders08_Ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int kenar1=10;
        int kenar2=10;
        int kenar3=10;
        System.out.println(kenar1==kenar2&&kenar2==kenar3 ?"Eskenar ucgen":"Eskenar ucgen degil");

        int sayi1=10;
        int sayi2=11;
        System.out.println(sayi1>sayi2?sayi2:sayi1);

    }
}
