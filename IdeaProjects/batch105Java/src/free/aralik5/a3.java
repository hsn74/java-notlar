package free.aralik5;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

import static ders18_arrays.C06_KullaciyaArrayOlusturma.arrayOlustur;

public class a3 {
    /*
TC kimlik numarasının son rakamı çift olmak zorundadır.
0 rakamı ile başlayamaz.
ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
Ayrıca; 1, 3, 5, 7 ve 9.
rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının
9 katının toplamının birler basamağı 10. rakamı;
 1, 3, 5, 7 ve 9. rakamın toplamının
8 katının birler basamağı 11. rakamı vermektedir.
 */
    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
        int[] kullaniciArrayi = arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));



        boolean kosul1 = (kullaniciArrayi[0] + kullaniciArrayi[1] + kullaniciArrayi[2] + kullaniciArrayi[3] + kullaniciArrayi[4] + kullaniciArrayi[5] + kullaniciArrayi[6] + kullaniciArrayi[7] + kullaniciArrayi[8] + kullaniciArrayi[9] + kullaniciArrayi[10]) % 10 == kullaniciArrayi[11];
            boolean kosul2 = (((kullaniciArrayi[1] + kullaniciArrayi[3] + kullaniciArrayi[5] + kullaniciArrayi[7] + kullaniciArrayi[9]) * 7) + ((kullaniciArrayi[2] + kullaniciArrayi[4] + kullaniciArrayi[6] + kullaniciArrayi[8]) * 9)) % 10 == kullaniciArrayi[10];
            boolean kosul3 = ((kullaniciArrayi[1] + kullaniciArrayi[3] + kullaniciArrayi[5] + kullaniciArrayi[7] + kullaniciArrayi[9]) * 8) % 10 == kullaniciArrayi[11];
        if (scan.hasNextBoolean()){
            System.out.println("gecerli tc");
        }else
            System.out.println("gecersiz ");
        }
    }



