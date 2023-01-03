package free.free.artikYil;

import java.util.Scanner;

public class notAlmaSorusu {
    public static void main(String[] args) {
        //Java Program to demonstrate the use of If else-if ladder.
        //It is a program of grading system for fail,
        // D grade, C grade, B grade, A grade and A+.
        Scanner scan=new Scanner(System.in);
        System.out.println("not gir:");
        int not= scan.nextInt();
        if(not<0) {
            System.out.println("gecersiz not");
        } else if (100<not) {
            System.out.println("gecersiz not");
        } else if (100<=not) {
            System.out.println("A");
        } else if (80<not || not<100 ) {
            System.out.println("B");
        } else if (50<not || not<80 ) {
            System.out.println("C");
        } else if (not<50) {
            System.out.println("D");




            

        }
    }
    }
