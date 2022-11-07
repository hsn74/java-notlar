package free;

import java.util.Scanner;

public class dagitim {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("alinan");
        int alinan = scan.nextInt();
        System.out.println("verilen");
        int verilen = scan.nextInt();
        System.out.println("dagitim:"+(verilen-alinan));
    }
}
