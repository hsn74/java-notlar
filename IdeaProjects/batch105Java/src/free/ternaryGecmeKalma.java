package free;

import java.util.Scanner;

public class ternaryGecmeKalma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double not=scan.nextDouble();
        System.out.println(not>50 ? "sınıfı gectin":"sınıfta kaldin");
    }
}
