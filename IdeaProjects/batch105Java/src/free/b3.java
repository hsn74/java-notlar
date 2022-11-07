package free;

import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
            /*kullanicidan toplamak için sayi al
        0a baasarsa sayi alma işlemini bitir
        kullanicidan kac sayi girdiğini ve sonucu ogren
         */
        Scanner scan=new Scanner(System.in);
        int sayi=5;
        int sayac=0;
        int toplam=0;
        while (sayi!=0){
            System.out.println("lutfen sayi gir"+"\nbitirmek  0'a bas");
            sayi=scan.nextInt();

            if (sayi!=0){
                sayac++;
                toplam=toplam+sayi;
            }
        }
        System.out.println("sayi"+sayac+"toplam:"+toplam);

    }
}



