package ders22_arrayLists;

import java.util.Arrays;
import java.util.List;

public class C03_ArrayAsList {
    public static void main(String[] args) {
        /*
         // Bu yontemin 2 negatif yonu vardir
        // 1- bu sekilde olusturulan list'ler esnek uzunluga sahip degillerdir
        //    add, remove gibi ozellikleri kullanmak isterseniz RunTimeException olusur

        // arraydenList.add(10); // UnsupportedOperationException
        // arraydenList.remove(1); // UnsupportedOperationException

        // 2- bu yontem kaynak olan array ile yeni olusturulan list'i birbirine baglar
        //    birinde yaptiginiz degisikligi, otomatik olarak digerine de yansitir

        // sadece array'in bir elemanini degistirelim
         */
        Integer[]arr={1,2,3};
        List<Integer>arraydenList= Arrays.asList(arr);
        System.out.println("Liste:"+arraydenList);
        System.out.println("Array:"+Arrays.toString(arr));
        arr[0]=10;
        System.out.println("array i degistirme Array:"+Arrays.toString(arr));
        System.out.println("array degistirme Liste:"+arraydenList);

    }
}
