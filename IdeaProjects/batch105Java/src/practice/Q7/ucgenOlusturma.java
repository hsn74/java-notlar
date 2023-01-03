package practice.Q7;

import java.util.Scanner;

public class ucgenOlusturma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" a: , b: , c: girin");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if (c>a-b && a+b>c){
            System.out.println("ucgen olusur");
        } else if (b>a-c && a+c>b) {
            System.out.println("ucgen olusur");
        } else if (a>b-c && b+c>a) {
            System.out.println("ucgen olusur");
        } else if (a==b&& b==c&& a==c) {
            System.out.println("eşkenar ucgen olusur");
        }else
            System.out.println("ucgen degil");
        }

    }
