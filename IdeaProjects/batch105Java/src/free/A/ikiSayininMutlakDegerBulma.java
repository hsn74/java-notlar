package free.A;

import java.util.Scanner;

public class ikiSayininMutlakDegerBulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi1 gir");
        System.out.println("sayi2 gir"+"\n bitirmek için 0 a bas");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        if(sayi1>sayi2){
            System.out.println(sayi1-sayi2);
        }
        if(sayi1<sayi2)
            System.out.println(sayi1-sayi2);
    }
}
