package free;

import java.util.Scanner;

public class freeee {
    public static void main(String[] args) {
       /* Scanner scan=new Scanner(System.in);
        System.out.println("kullanici ismi");
        String isim=scan.nextLine();
        System.out.println(isim);*/

    /*mail @ isareti icermiyorsa gecersiz email
        @gmail.com icermiyorsa gmail adresi gecersiz
        @gmail.com ile bitmiyorsa yazim hatasi

         */

        String email="hasanozsoy@gmai.com";
        if(!email.contains("@")){
            System.out.println("gecersiz");
        } else if (email.contains("@gmail.com")) {
            System.out.println("gecersiz");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi");

        }


    }
}
