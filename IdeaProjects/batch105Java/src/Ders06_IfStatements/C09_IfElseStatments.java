package Ders06_IfStatements;

public class C09_IfElseStatments {
    public static void main(String[] args) {
        //kullaniciden tam sayi al
        //sayi negatif ise gecersiz say
        //tek ise rakam
        //bunun dısındakiler için buyuk sayi yazdir
        int sayi=9;
        if (sayi<0){
            System.out.println("gecersiz sayi");
        } else if(sayi<10) {
            System.out.println("rakam");
        }else if (sayi<100) {
            System.out.println("orta sayi");
        } else {
            System.out.println("buyuk sayi");

        }

    }
}
