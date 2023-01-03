package free.D;

import java.util.Scanner;

public class degisken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen a sayiyi giriniz");
        int a = scan.nextInt();
        System.out.println("lutfen b sayiyi giriniz");
        int b = scan.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a'in degeri:" + a );
        System.out.println("b'nin degeri :" + b);

    }
}
