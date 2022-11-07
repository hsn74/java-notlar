package ders08_Ternary;

import java.util.Scanner;

public class C08_ternary_switch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        switch (harf){
            case 'J':
            case 'j':
                System.out.println("Java");
                break;
            case 'D':
            case 'd':
                System.out.println("Devolepment");
                break;
            case 'k':
            case 'K':
                System.out.println("kit");
                break;
            default:
                System.out.println("geversiz harf");
        }
    }
}
