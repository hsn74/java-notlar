package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_TamBolenlerListesi {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan pozitif bir tamsayi alip,
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.
        int input = 28;
        System.out.println(tamBolenlerListesi(input));


    }

    public static List<Integer> tamBolenlerListesi(int input) {
        List<Integer> tamBolenlerListesi = new ArrayList<>();
        for (int i = 0; i <= input; i++) {
            if (input % i == 0) {
                tamBolenlerListesi.add(i);
            }
        }
        return tamBolenlerListesi;
    }
}
