package Ders06_IfStatements;

import java.util.Scanner;

public class C05_IfElseStatments {
    public static void main(String[] args) {
        //soru3: Kullacidan yasini isteyin,65 yas uzeri ve emekli olabilirsin yazdirin.
        // yoksa emekli olmasi için gereken yil sayisini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi yaziniz");
        double yas=scan.nextDouble();

        if(yas>=65) {
            System.out.println("Yaşınız emeklilik için yeterli");
        } else {
            System.out.println("emekli olmak icin" + (65-yas)+"sene daha calismalisin");
        }
    }
}
