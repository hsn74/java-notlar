package free.B;

import java.util.Scanner;

public class toplamBulma {
    public static void main(String[] args) {
        // Klavyeden okuma yapmak için Scanner nesnesini oluştur.
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi gir:");

        int sayi= scan.nextInt();

        // nextInt() metodu ile tam sayı türünde değer okuması yapılır.
        for (int i = 1; i <= sayi; i++) {
            sayi*= i;


        }
        System.out.println(sayi);

    }


}

