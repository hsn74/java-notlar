package free.karişik;

import java.util.Scanner;

public class switchCase3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("iki basamakli sayi yaz");

        int ikiBasamakliSayi=13;
        switch (ikiBasamakliSayi){
            case 1:
            System.out.println("ikiBasamakliSayi:+onbir");
            default:
                System.out.println("oniki");
        }
    }
}
