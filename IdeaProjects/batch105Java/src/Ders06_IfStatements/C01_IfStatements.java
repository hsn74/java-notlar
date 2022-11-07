package Ders06_IfStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ay isminin ilk harfini giriniz");
        char ilkHarf = scan.next().charAt(0);
        if (ilkHarf =='o' || ilkHarf == 'O'){
            System.out.println("Ocak");
        }
        if (ilkHarf == 's' || ilkHarf == 'S'){
            System.out.println("Subat");
        }
         if (ilkHarf=='m'|| ilkHarf=='M'){
            System.out.println("Mart veya Mayis");
            }
         if (ilkHarf == 's' || ilkHarf == 'S'){
            System.out.println("Subat");
                 }
            }
            }