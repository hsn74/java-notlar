package ders45_maps;

import ders44_maps.MapDepo;

import java.util.Map;

public class C05_Maps {
    //OGRENCİ MAP inden numara ,isim ve soyisim degerlerini yazdiralim
    public static void main(String[] args) {
        Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();
        ogrenciMap.put(110,"suleyman-Sah-11-T-MF");
        MapDepo.numaraIsimSoyisimYazdir(ogrenciMap);
        MapDepo.numaraIsimSoyisimYazdir(ogrenciMap);

    }
}
