package Ders06_IfStatements;

import java.util.Scanner;

public class C07_IfElseStatments {
    public static void main(String[] args) {
       //kullanicidan bir harf iste
       //girilen kucuk harf ise onu buyuk harf olarak yazdir
       // yoksa girilen harfi yazdir
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen vir karakter gir");
        char krk=scan.next().charAt(0);
        if (krk>='a' && krk <='z') {
            System.out.println((char)(krk-32));
        }else{
            System.out.println(krk);
        }
    }
}
