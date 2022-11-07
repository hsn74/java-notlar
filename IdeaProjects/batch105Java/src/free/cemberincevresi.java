package free;

import java.util.Scanner;

public class cemberincevresi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yaricap giriniz");
        int yaricap= scan.nextInt();
        double cemberincevresi=2*3.14*yaricap;
        System.out.println(cemberincevresi);
    }
}
