package grupodev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);


        System.out.println("yas gir:");
        int yas=scan.nextInt();

        System.out.println("km gir:");
        int km=scan.nextInt();

        System.out.println("gidisdonus:");
        boolean gidisdonus;
        if(yas<12) {
            System.out.println("fiyat:" + km * (0.90));
        } else if (12 < yas & yas < 24) {
            System.out.println("fiyat:" + km * (0.90));

        } else if (yas>65) {
            System.out.println("fiyat:" + km * (0.70));
        } else {
            System.out.println("fiyat:" + km * (0.80));



        }
    }
}
