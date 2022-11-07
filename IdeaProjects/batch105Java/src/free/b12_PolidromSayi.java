package free;

import java.util.Arrays;
import java.util.Scanner;

public class b12_PolidromSayi {
    public static void main(String[] args) {
        int[] arr={1,3,9,5,4,6};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,1));
        System.out.println(Arrays.binarySearch(arr,6));
    }
}

