package ders26_passByvalue_immutableClasses;

import java.util.Arrays;

public class C05_PassByValueArray2 {
    public static void main(String[] args) {
        // bir method olusturun
        // sayilar array'inin uzunlugundan 2 fazla olan
        // ve elementlerin tamami 5 olan yeni bir array olusturup
        // deger olarak sayilar array'ine atayin ve sayilar array'ini yazdirin
        int[]sayilar={3,4,5,6};
        arrayeYeniDegerAta(sayilar);
    }
    public static void arrayeYeniDegerAta(int[] sayilar){
        int[] yeniArray=new int[sayilar.length+2];
        for (int i = 0; i <yeniArray.length ; i++) {
            yeniArray[i]=5;
        }
        System.out.println("metodda son hal:"+Arrays.toString(sayilar));
    }
}
