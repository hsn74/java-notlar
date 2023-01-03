package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C03_compute {
    public static void main(String[] args) {
        Map<String,Integer>mp1=new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);
        // C key varsa degerini 3 arttır
        if(mp1.containsKey("C")){
            mp1.put("C",mp1.get("C")+3);//{A=5, B=3, C=10}
        }
        System.out.println(mp1);
        mp1.computeIfPresent("B",(k,v)->2*v);
        System.out.println(mp1);
        //B key olarak varsa degerini 2 ile carp
        // "A" key olarak varsa degerini 5 azaltin
        // Map'de D yoksa valuse'su 11 olacak sekilde ekleyelim
        if(!mp1.containsKey("D")){
            mp1.put("D",11);
            System.out.println(mp1.computeIfPresent("A", (k, v) -> v - 5));
            System.out.println(mp1);

        }
        System.out.println(mp1);//{A=5, B=3, C=10, D=11}
        // E yoksa degeri 8 olarak ekleyelim
        // E'nin degerini 4 artir
        mp1.computeIfAbsent("E",v->8);
        System.out.println(mp1);
        mp1.compute("E",(k,v)->v+4);
        System.out.println(mp1);
        mp1.compute("F",(k,v)->v*3);
        System.out.println(mp1);//java.lang.NullPointerException

    }
}
