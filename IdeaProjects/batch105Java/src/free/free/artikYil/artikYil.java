package free.free.artikYil;

import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yil gir:");
        int yil = scan.nextInt();
        if (((yil % 4 == 0) && (yil % 100 != 0)) || (yil % 400 == 0)) {
            System.out.println("artik yil");
        } else {
            System.out.println("normal yil");
        }
    }
}
