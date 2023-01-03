package free.C;

import java.util.Scanner;

public class Case2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        switch (sayi){
            case 1:
            System.out.println("bir");
            break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("bes");
                break;
            default:
                System.out.println("gecersiz sayi");
                break;
        }

    }
}
