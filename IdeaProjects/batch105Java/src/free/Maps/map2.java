package free.Maps;

import ders44_maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class map2 {
    public static void main(String[] args) {
        //ogrenciler mapinde subesi h olan ogrencilerin isim soy isimlerini bul yazdır
        Map<Integer,String> ogrenciMap= MapDepo.ornekMapOlustur();
        Collection<String>ogrenciValueCollection=ogrenciMap.values();
        System.out.println(ogrenciValueCollection);
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
        }

         */
        System.out.println(ogrenciMap);
        Set<Integer>ogrenciKeySet=ogrenciMap.keySet();
        //normalde bilgiler arasina virgül konur
        //value lar tek stringtir
        System.out.println(ogrenciValueCollection.size());


        //

    }
}
