package free;

import java.util.Scanner;

public class ternary9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen not giriniz");
        int not=scan.nextInt();
        String sonuc=(not>50 ? "gecti": "kaldi");
        System.out.println(sonuc);
    }

    }
