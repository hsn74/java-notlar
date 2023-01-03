package free.D;

public class d1 {
    public static void main(String[] args) {
        int sayi1;
        int sayi2;

        toplama(4,6);
        //parametre sayisi degidtikce bizden yeni metod olusturma ister
    }
    public static void toplama(int sayi1, int sayi2,int...sayi) {
        System.out.println("2 sayinin toplami:"+(sayi1+sayi2));
    }

    }

