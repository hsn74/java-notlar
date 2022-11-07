package free;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen not giriniz");
        double not=scan.nextDouble();
        if(not<=50 ) {
            System.out.println("kaldi");
        }else {
            System.out.println("gecti");
        }

    }
}
