package free;

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        /*Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        yazdirin.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi gir: ");
        double sayi=scan.nextDouble();
        if (sayi%2==0) {
            System.out.println("cift");
        } else if (sayi%2!=0) {
            System.out.println("sayi tek");
        } else if (sayi%2==0 && sayi/10==0) {
            System.out.println("10 kati");


        }

        }

        }

