package free.polidrom;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class arr2 {
        public static void faktoriyel(){
            Scanner scan=new Scanner(System.in);
            System.out.println("sayi gir: ");
            int sayi=scan.nextInt();
            int faktoriyel=1;
            for (int i = 0; i <sayi ; i++) {
                faktoriyel*=sayi;
                sayi--;
            }
            System.out.println(faktoriyel);
        }
        public static void main(String [] args){
            faktoriyel();
        }
}



