package ders45_maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {
        // Verilen bir cumlede kullanilan her bir harfi
        //ve o harfin kullanim miktarını
        //A=5, b=3.... gibi yazdirin
        String str="Javayi balonu patlatmadan bitirelim";
        //j=1, a=7, v=1, y=1
        String [] harflerArr=str.split("");
        System.out.println(Arrays.toString(harflerArr));
        //[J, a, v, a, y, i,  , b, a, l, o, n, u,  , p, a, t, l, a, t, m, a, d, a, n,  , b, i, t, i, r, e, l, i, m]
        Map<String,Integer>kullanimMiktariMap=new TreeMap<>();
        int sayac=1;
        for (int i = 0; i < harflerArr.length ; i++) {
            //2 ele aldıgıöız harfin daha once eklenip eklenmediğini kontrol et
            if(kullanimMiktariMap.containsKey(harflerArr[i])){
                continue;
            }else{
                //kod buraya geldiyse o harf henüz map a eklenmemiştir.
                //o zaman bu harfin kullanim miktarini bulmaliyiz.
                for (int j = i+1; j < harflerArr.length ; j++) {
                    if(harflerArr[j].equals(harflerArr[i])){
                        sayac++;

                    }

                }
                //sayma islemi bitti key ve value yu map a ekleyelim
                kullanimMiktariMap.put(harflerArr[i],sayac );
                sayac=1;

            }


        }
        System.out.println(kullanimMiktariMap);
        /*{ =3, J=1, a=7, b=2, d=1, e=1, i=4, l=3, m=2, n=2, o=1, p=1, r=1, t=3, u=1, v=1, y=1}*/
    }
}
