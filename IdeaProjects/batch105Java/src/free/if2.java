package free;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char ilkHarf=scan.next().charAt(0);
        if(ilkHarf=='o'|| ilkHarf=='0'){
            System.out.println("Ocak");
        }
    }
}
