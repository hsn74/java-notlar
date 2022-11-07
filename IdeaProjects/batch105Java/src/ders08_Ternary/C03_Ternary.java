package ders08_Ternary;

public class C03_Ternary {
    public static void main(String[] args) {
        int a= 5;
        //ternary tek basına kullanılmaz
        String sonuc=a%2==0 ? "cift sayi":"tek sayi";
        String sonuc2= a>10 ? "buyuk sayi": ""+2*a ;
        System.out.println(sonuc2);
    }

}