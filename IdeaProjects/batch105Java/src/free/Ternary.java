package free;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int girilenSayi=scan.nextInt();
        System.out.println(girilenSayi%5==0?"sayi 5in kati":"5in kati degil");

    }
}
