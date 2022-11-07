package ders19_arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,8,3,7,2,5,8,1};
        System.out.println(Arrays.binarySearch(arr,8));
        System.out.println(Arrays.binarySearch(arr,5));
        /*binarysearch ile yapilan arastirmanin sonucu dogru da yanlis da olabilir.
         */

    }
}
