package free;

import java.util.Scanner;

public class dogru {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("a gir");
        double a=scan.nextDouble();
        System.out.println("b gir");
        double b=scan.nextDouble();
        System.out.println("x i gir");
        double x=scan.nextDouble();
        System.out.println("dogru:"+ (a*x+b));
    }
}
