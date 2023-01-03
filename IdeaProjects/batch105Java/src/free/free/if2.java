package free.free;

import java.util.Scanner;

public class if2 {
    /*Task
    Given an integer, , perform the following conditional actions:

    If  is odd, print Weird
    If  is even and in the inclusive range of 2 to 5, print Not Weird
    If  is even and in the inclusive range of 6 to 20, print Weird
    If  is even and greater than 20, print Not Weird
    Complete the stub code provided in your editor to print whether or not  is weird.*/
        /*Bir tamsayı verildiğinde, aşağıdaki koşullu eylemleri gerçekleştirin:

        Tek ise, Garip yazdır
        Çift ise ve 2 ila 5 aralığındaysa, Garip Değil yazdırın
        Çift ise ve 6 ila 20 aralığındaysa, Garip yazdırın
        Çift ve 20'den büyükse Tuhaf Değil yazdırın
        Garip olup olmadığını yazdırmak için editörünüzde sağlanan saplama kodunu tamamlayın.
        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi gir:");
        int sayi = scan.nextInt();
        if (sayi%2!=0) {
            System.out.println("garip");
        } else if (sayi%2==0 && sayi > 2 && sayi < 5) {
            System.out.println("garip degil");
        } else if (sayi%2==0 && sayi > 6 && sayi < 20) {
            System.out.println("garip");
        } else if (sayi%2==0  && sayi >20) {
            System.out.println("tuhaf degil");

        }
    }
}
