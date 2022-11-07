package ders19_arrays;

import ders18_arrays.C03_ArraysElementleriArtir;
import ders18_arrays.C04_ArrayElementleriToplama;
import ders18_arrays.C05_ArraydeElemanArama;
import ders18_arrays.C06_KullaciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
    public static void main(String[] args) {
        int[]arr={2,3,4};
        C03_ArraysElementleriArtir.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr));
        //arr array in elementlerini topla
        System.out.println(C04_ArrayElementleriToplama.pozitifElementleriTopla(arr));
        C05_ArraydeElemanArama.elemanAra(arr,10);
        //kullanicidan deger al array olustur
                int[] yeniarr= C06_KullaciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniarr));
    }
}
