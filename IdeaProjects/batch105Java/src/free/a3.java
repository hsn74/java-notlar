package free;

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*Kullanicidan bir sayi alin ve mutlak degerini yazdirin*/
        System.out.println("sayi gir: ");
        int sayi=scan.nextInt();
        System.out.println(sayi>0 ? sayi:-sayi );
    }
}
