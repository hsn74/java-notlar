package ders45_maps;

import ders44_maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {
    //ogrenci map inde numarasi 105 ten buyuk olanlarin
    //isim soy isim ve bolumlerini yaz
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
           }
         */
    Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();
    int basNo=103;
    int bitNo=107;
    List<String> isimListesi=MapDepo.numaraDegerineGoreListeOlustur(ogrenciMap,basNo,bitNo);
        System.out.println(isimListesi);
}

}
