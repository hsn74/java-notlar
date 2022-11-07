package ders21_arrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        //verilen arraydaki tekrarlari silme
        //bir kere olacak sekilde array i düzenle
        //bu array i liste yapmak cok zor
        //bununyerine tek tek incele
        //tekrarsiz olanlari liste ata
        //en son liste yi olusturan array yaz
        // yeni arrayi eski array a deger olarak atar
        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};
        List<Integer> tekrarsizListe=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if (!tekrarsizListe.contains(arr[i])) ;
            tekrarsizListe.add(arr[i]);
        }
        System.out.println("arrayin tekrarsiz hali:"+ tekrarsizListe);
        arr=new int[tekrarsizListe.size()];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=tekrarsizListe.get(i);
        }
        //array istenen hale geldi
        System.out.println(Arrays.toString(arr));
    }
}

