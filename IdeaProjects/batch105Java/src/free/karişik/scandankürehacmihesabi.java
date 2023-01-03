package free.karişik;

import java.util.Scanner;

public class scandankürehacmihesabi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yaricap");
        int yaricap=scan.nextInt();
        double kureninHacmi=scan.nextDouble();
        kureninHacmi=4/3*3.14*yaricap*yaricap*yaricap ;
        System.out.println(kureninHacmi);

    }
}
