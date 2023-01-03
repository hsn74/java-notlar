package free.D;

import java.util.Scanner;

public class basit_if_statment {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif tam sayi giriniz");
        int girilenSayi=scan.nextInt();
        if (girilenSayi%5==0){
            System.out.println("Girilen sayi 5'in kati");

        }
    }
}
