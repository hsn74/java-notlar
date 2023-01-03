package free.karişik;

import java.awt.*;
import java.util.Scanner;

public class karzarar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kar gir");
        double kar=scan.nextDouble();
        System.out.println("zarar gir");
        double zarar=scan.nextDouble();
        double karzarar=scan.nextDouble();
        System.out.println("karzarar:"+(kar-zarar));
    }
}
