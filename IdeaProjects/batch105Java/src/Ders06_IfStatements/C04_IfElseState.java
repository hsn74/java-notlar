package Ders06_IfStatements;

import java.util.Scanner;

public class C04_IfElseState {
    public static void main(String[] args) {
        //soru4:kullanicidan bir karakter aliniz.
        //girilen karakterin buyuk harf olup olmadığını yazdir
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char krk=scan.next().charAt(0);
        if(krk >='A' && krk<='Z') {
            System.out.println("Buyuk harf ");
        } else {
            System.out.println("Buyuk harf degil");
        }
    }
}
