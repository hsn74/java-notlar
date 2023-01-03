package free.B;

import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double sayi=0;
        double sum=0;
        while(sayi<20){
            System.out.println("sayi gir:");
            sayi=scan.nextDouble();
            sum+=sayi;//sum=sum+sayi;
        }
        System.out.println("sayi :" + sum + " bu kadar yeter");
    }}
