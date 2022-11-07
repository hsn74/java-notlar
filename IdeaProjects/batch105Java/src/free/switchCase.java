package free;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("rakam1 al");
        int rakam1 = scan.nextInt();
      //  char harf = scan.next().charAt(0);


        switch (rakam1) {
            case 1:
                System.out.println("rakam1=a");
                break;
            case 5:
                System.out.println("b");
                break;


        }
    }
}
