package ders43_collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {
        //verilen array in tekrar elementlerini sil
        //her elementin sadece 1 kere kullanıldıgı hala getır
        int [] arr={6,4,3,2,3,3,5,6,4,3,2,4,6,3,2,1,2,4,5,5,1};
        Set<Integer> geciciSet=new HashSet<>();
        for (Integer each:arr
             ) {
            geciciSet.add(each);
        }
        arr=new int[geciciSet.size()];
        //eski array yeni boyut tanımla
        //Set deki benzersiz hale getirilen elementleri geciciArray e taşı
        int index=0;
        for (Integer each:geciciSet
             ) {
            arr[index]=each;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
