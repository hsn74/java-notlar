package free.ifElse;

import java.util.Scanner;

public class IfBolme2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        int not=scan.nextInt();
     if(not>=85) {
         System.out.println("notunuz AA");
     }else if(not>=70) {
         System.out.println("notunuz BB");
     }else if(not>=50) {
         System.out.println("notunuz CC");
     }else{
         System.out.println("notunuz DD");
     }
     }

    }

