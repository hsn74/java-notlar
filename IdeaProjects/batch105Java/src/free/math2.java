package free;

import java.util.Scanner;

public class math2 {
    public static void main(String[] args) {
            int sayi=24;
            System.out.println(asalSayiKontrolEt(sayi));
            System.out.println(asalSayiKontrolEt(1024));
        }
        public static String asalSayiKontrolEt(int sayi){
            String sonuc="";
            for (int i = 2; i <=(sayi-1) ; i++) {
                if(sayi%i==0)
                    sonuc="asal degil";
                break;

            }
            if(!sonuc.equals("asal degil")){
                sonuc="asal";
            }
            return sonuc;
    }
}
