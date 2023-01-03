package free.Maps;

import ders44_maps.MapDepo;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class map1 {
    //*verilen her harfin kullanim miktarini bulma,
    public static void main(String[] args) {
        String str = "javayi balonu patlatmadan bitirelim";
        String[] harflerArr = str.split("");
        //[j, a, v, a, y, i,  , b, a, l, o, n, u,  , p, a, t, l, a, t, m, a, d, a, n,  , b, i, t, i, r, e, l, i, m]
        Map<String, Integer> kullanimMiktarlariMap = new TreeMap<>();
        // sırasi ile tümü inceleme yapilacak
        int sayac = 1;
        for (int i = 0; i < harflerArr.length; i++) {
            //incelediğimiz harfin daha önce eklenip eklenmediğini kontrol et
            if (kullanimMiktarlariMap.containsKey(harflerArr[i])) {
                continue;
            } else {
                //kod buraya gelmişse henüz eklenmemiştir.
                //o zaman bu harfin kullanim miktarini bulmalisniz
                for (int j = i + 1; j < harflerArr.length; j++) {
                    if (harflerArr[j].equals(harflerArr[i])) {
                        sayac++;
                    }
                }
                // sayma işlemi bitti Key ve Value yu map e ekle
                kullanimMiktarlariMap.put(harflerArr[i], sayac);
                sayac = 1;
            }
        }
        System.out.println(kullanimMiktarlariMap);

    }

}
