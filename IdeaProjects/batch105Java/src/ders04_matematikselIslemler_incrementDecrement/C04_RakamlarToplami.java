package ders04_matematikselIslemler_incrementDecrement;

public class C04_RakamlarToplami {
    public static void main(String[] args) {
        int input = 1453;
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;
        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;
        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;
        birlerBasamagi = input % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        input = input/10;
        System.out.println("verilen sayinin rakamlar toplami:"+rakamlarToplami);

    }
}
