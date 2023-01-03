package ders19_arrays;

import java.util.Arrays;

public class C06_ArrayayeniDegerAtama {
    public static void main(String[] args) {
        //var olan bir array in uzunlugu degismez
        //ama yeni bir array degeri atanabilir.
        // var olan bir arrayi yeni deger olarak atayabiliriz.
        String [] arr1={"ali","veli"};
        String[]arr2={"A","B","C"};
        System.out.println(Arrays.toString(arr1));
        arr1=new String[6];
        System.out.println(Arrays.toString(arr2));



    }
}
