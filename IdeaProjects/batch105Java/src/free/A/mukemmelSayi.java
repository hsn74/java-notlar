package free.A;

import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi gir: ");
        int sayi=scan.nextInt();
        int toplam=0;
        for (int i = 1; i <sayi ; i++){
        if (sayi%i==0){
            toplam+=i;
        }
            
        }
        if(sayi==toplam){
            System.out.println("mukemmel sayi");
        }else {
            System.out.println("mukemmel sayi degil");
        }
        } }
        

