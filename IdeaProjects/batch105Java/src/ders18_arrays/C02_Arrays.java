package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String [] arr={"ali","ulus","nesrin"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i] + " ");
        }
            // bu array i array olarak yazdir
            System.out.println();
            // array bir obje /non primitive dayta oldugundan java referans yazdirir.
        // array i array olarak yazdirmak için array clasdan yazdim alınır.
        System.out.println(Arrays.toString(arr));


    }
}
