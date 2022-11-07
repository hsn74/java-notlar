package free;

import java.util.Scanner;

public class vucutKutleIndexi {
    public static void main(String[] args) {
       /* Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        zayif yazdirin.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("kilo: ");
        System.out.println("boy: ");
        double kilo=scan.nextDouble();
        double boy=scan.nextDouble();
        double vki=(kilo*10000 / (boy *boy));
        if(vki>25 && vki<30) {
            System.out.println("kilolu");
        } else if (vki>20 && vki<25) {
            System.out.println("normal");
        } else if (vki<20) {
            System.out.println("zayif");


        }
    }
}
