package free;

import java.util.Scanner;

public class DataCasting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi girininz");
        int girilenSayi= scan.nextInt();
        byte donusensayi=(byte) girilenSayi;
        System.out.println(donusensayi);

    }
}
