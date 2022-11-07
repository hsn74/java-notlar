package ders19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidanDegerAlarakArrayOlusturma {
    public static void main(String[] args) {
        //kullanicidan istedigi kadar sayi al array olustur
        //kullanici 0 a basssin ve program bitsin
        Scanner scan=new Scanner(System.in);
        int[] arr={0};
        int girilensayi=0;
        do {
            System.out.println("arraya eklemek için tam sayi gir"+ "bitirmek için sıfıra bas");
            girilensayi=scan.nextInt();
            if(arr[0]==0) {
                arr[0] = girilensayi;
            }else if(girilensayi!=0){
                arr = C08_ArrayeElemanEklemeMethodu.arrayeElemanEkle(arr, girilensayi);
            }

            }while(girilensayi!=0);
        System.out.println(Arrays.toString(arr));
    }
}
