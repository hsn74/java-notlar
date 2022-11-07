package ders15_overloading_whileLoop;

public class C08_WhileLoop {
    public static void main(String[] args) {
        // Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
        int sayi=1453;
        int birlerBas=0;
        int toplam=0;
        while (sayi!=0){
            birlerBas=sayi%10;
            toplam+=birlerBas;
            sayi/=10;

        }
        System.out.println(toplam);
    }
}
