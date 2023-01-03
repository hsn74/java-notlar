package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C04_Soru {
    public static void main(String[] args) {
        //verilen cumledeki karakterleri
        //kacar tane kullanıldıgını yazdırın
        String str="Javayi balonu patlatmadan bitirelim";
        String[]strArr=str.split("");
        Map<String,Integer>kullanimMiktarlariMap=new HashMap<>();
        for (int i = 0; i <strArr.length ; i++) {
            //ele aldıgım elementlerin kullanım mıktarı 1 olarak map a ekle
            kullanimMiktarlariMap.putIfAbsent(strArr[i],1);
            //ele alacagınız element map de varsa kullanım mıktarını 1 arttır
            kullanimMiktarlariMap.computeIfPresent(strArr[i],(k,v)->v+1);

        }
        System.out.println(kullanimMiktarlariMap);
    }
}
