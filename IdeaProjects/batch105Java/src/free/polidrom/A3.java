package free.polidrom;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi gir: ");
                double sayi=scan.nextInt();
                if(sayi<0.0) {
                    // sayı 0 dan küçükse negatif
                    System.out.println(sayi + "negatiftir.");

                } else if (sayi>0.0) {
                    System.out.println(sayi+ "pozitiftir.");

                }else
                    System.out.println(sayi+ "sıfırdır.");

                    // aksi durumda yani 0'a eşitse

            }
        }
