package free.karişik;

import java.util.Scanner;

public class UcgeninCevresi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("kenar1:");
        double kenar1=scan.nextDouble();
        System.out.println("kenar2:");
        double kenar2=scan.nextDouble();
        System.out.println("kenar3:");
        double kenar3=scan.nextDouble();
        double cevre=kenar3+kenar2+kenar1;
        System.out.println(cevre);



    }
}
