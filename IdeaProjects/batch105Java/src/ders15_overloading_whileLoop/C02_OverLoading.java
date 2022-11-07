package ders15_overloading_whileLoop;

public class C02_OverLoading {
    public static void main(String[] args){
    carpim(3,5);
}

    public static void carpim(int sayi1 ,int sayi2){
        System.out.println("iki integer sayinin carpimi: "+sayi1*sayi2);
    }
    public static void carpim(double sayi3,int sayi4){
        System.out.println("iki integer sayinin carpimi: "+sayi3*sayi4);
    }
}
