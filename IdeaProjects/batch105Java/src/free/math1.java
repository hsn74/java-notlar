package free;

import java.util.Scanner;

public class math1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ücgenin kenarlarini giriniz");
        double ücgeninkenarlari =scan.nextDouble();
        System.out.println("h gir");
        double h =scan.nextDouble();
        double ücgeninAlani=(h*ücgeninkenarlari)/2;
        System.out.println("ücgeninAlani:"+ücgeninAlani);



    }
}