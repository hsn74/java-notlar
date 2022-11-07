package Ders06_IfStatements;

import java.util.Scanner;

public class C08_IfElseStatments {
    public static void main(String[] args) {
        //soru 4:kullanicidan bir ucgenin 3 kenarini alin;
        //kenarlari 0 veya negatif ise ucgen degil
        //ucgen ise "eskenar ucgen yazdir, degilse eskenar ucgen degil yazdir.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ucgenin 3 kenarini giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();
        if (kenar1<=0 || kenar2<=0 || kenar3<=0) {
            System.out.println("gecersiz kenar uzunlugu");

        } else if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("eskenar ucgen");
        }else {
            System.out.println("eskenar ucgen degil");

        }
    }
    }

