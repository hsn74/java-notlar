package ders08_Ternary;

import java.util.Scanner;

public class C01_Ternary {
    //kullanicidan bir sayi alin
    //sayi pozitif ise katini al
    // pozitif degilse 10 ekle
//gfhjkmölçş..lkjhgf
    //*****g
    //***
    //*****
    //12345


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();
        if(sayi>0) {
            System.out.println(sayi * 2);
        }else{
            System.out.println(sayi+10);
        }
        System.out.println(sayi>0?2*sayi:sayi+10);
    }
}
