package free;

import java.util.Scanner;

public class IfkiloBoy {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen agırlıgınızı kilo olarak giriniz");
        double agirlik=scan.nextDouble();
        System.out.println("lutfen boyunuzu cm olarak giriniz");
        double boy=scan.nextDouble();

        double vke=agirlik*10000/(boy*boy);
        if(vke>30) {
            System.out.println("obez");
        }else if(vke>=25) {
            System.out.println("kilolu");
        }else if(vke>=20) {
            System.out.println("normal");
        }else{
            System.out.println("zayif");
        }

    }
}
