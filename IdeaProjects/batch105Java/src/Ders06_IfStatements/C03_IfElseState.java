package Ders06_IfStatements;

import java.util.Scanner;

public class C03_IfElseState {
    public static void main(String[] args) {
        //soru 4:kullanicidan bir ucgenin 3 kenarini alin;
        //eskenar ise "Eskenar ucgen" yazdirir.degilse eskenar ucgen degil
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ucgenin 3 kenarini giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();
        if(kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");

        }
    }
}
