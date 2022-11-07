package free;

import java.util.Scanner;

public class free1 {
    /*
Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
		//Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
		//herhangi bir sayı Mükemmel Sayı olarak bilinir.
		//Input :6
		//Output:6 Mukemmel Sayidir.
		//======================
		//Input7
		//Output:	7 Mukemmel Sayidir degildir.
*/

            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int toplam = 0;
                System.out.print("Bir sayi giriniz: ");
                int sayi = scan.nextInt();
                for (int i = 0; i < sayi ; i++) {
                    if(sayi==toplam) {
                        toplam+=i;
                    } }
                if(sayi==toplam){;
                        System.out.println("mukemel sayi");
                    }else{
                        System.out.println("mukemmel sayi degil");
                } } }


