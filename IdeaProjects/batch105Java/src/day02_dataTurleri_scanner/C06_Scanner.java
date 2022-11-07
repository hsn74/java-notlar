package day02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen dikdortgenin iki kenar uzunlugunu giriniz+"+
                "iki kenar uzunluğu arasinda entere basiniz");
        double kenar1=scan.nextDouble();
        double kenar2= scan.nextDouble();
        System.out.println("dikdortgenin alani:"+(kenar1*kenar2));
    }
}
