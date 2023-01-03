package free.ifElse;

import java.util.Scanner;

public class gereksiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen not giriniz");
        int not = scan.nextInt();
        if (not < 0) {
            System.out.println("not<0 : +sınıfta kaldi");
        }
        if (not > 49) {
            System.out.println("ders durumu:gectiniz");

        }
        if(not>80){
            System.out.println("ders durumu:"+"tesekkür aldi");
        }
    if (not>85){
        System.out.println("ders durumu:"+"takdir aldi");
    }

    }
}

