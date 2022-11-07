package ders18_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaciyaArrayOlusturma {
    //Kullanicidan array’in boyutunu ve elementlerini alip
    // array’i olusturan ve bize donduren bir method olusturun.
    public static void main(String[] args) {
        int[] kullaniciArrayi = arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));
    }

    public static int[] arrayOlustur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("olusturulacak array in boyutunu gir");
        int length = scan.nextInt();
        int[] kullaniciArrayi = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("array a eklenecek sayi gir");
            kullaniciArrayi[i] = scan.nextInt();
        }
        return kullaniciArrayi;
    }

}
