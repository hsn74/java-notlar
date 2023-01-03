package ders18_arrays;

import java.util.Arrays;

public class C03_ArraysElementleriArtir {
    public static void main(String[] args) {
        // Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.
        // eski array i yeni haliyle kaydedin.

        int [] arr = {2, 4, 6, 8};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+2;
        }
        System.out.println(Arrays.toString(arr));
        arr=elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[]elementleri2Artir(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+4;
        }
        return arr;
    }
}

