package free.Maps;

import ders44_maps.MapDepo;

import java.util.Map;

public class map3 {
    public static void main(String[] args) {
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
        String subeadi="H";
        MapDepo.subeOgrenciBilgileriniYazdir(ogrenciMap,subeadi);

    }
}
