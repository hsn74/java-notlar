package free.karişik;

import java.awt.*;
import java.util.Scanner;

public class yamukalani {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("altkenar girininiz");
        int altkenar=scan.nextInt();
        System.out.println("ustkenar girininiz");
        int ustkenar=scan.nextInt();
        System.out.println("h girininiz");
        int h= scan.nextInt();
        double yamukalani=scan.nextDouble();
        yamukalani=((altkenar + ustkenar)*h/2);
        System.out.println("yamukalani:"+(altkenar + ustkenar)*h/2);


    }
}
