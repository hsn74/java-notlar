package free.A;

import java.util.Locale;
import java.util.Scanner;

public class a5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("sayi gir");
        double sayi=scan.nextDouble();
        double kup;
         kup = sayi * sayi * sayi;
        System.out.println(kup);

    }
}