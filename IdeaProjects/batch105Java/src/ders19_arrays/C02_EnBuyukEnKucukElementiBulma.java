package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementiBulma {
    public static void main(String[] args) {
        //Verilen bir int array'de en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun
        // int[] arr={3,8,1,5,2,9};
    int[] arr={3,8,1,5,2,9};
        EnBuyukEnKucukElementYazdir(arr);
    }
    public static void EnBuyukEnKucukElementYazdir(int[]arr){
        Arrays.sort(arr);
        System.out.println("en buyuk element:"+arr[arr.length-1]);
        System.out.println("en kucuk element:"+arr[0]);
    }

}
