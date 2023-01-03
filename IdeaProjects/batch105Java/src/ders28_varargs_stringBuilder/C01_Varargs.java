package ders28_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
        topla(5,7);
        topla(5,3,8);
        //parametre sayisi degidtikce bizden yeni metod olusturma ister
    }

    public static void topla(int sayi1, int sayi2,int sayi3) {
        System.out.println("2 sayinin toplami:"+(sayi1+sayi2+sayi3));
    }

     public static void topla(int sayi1, int sayi2) {

        System.out.println("2 sayinin toplami:"+(sayi1+sayi2));
    }
}
