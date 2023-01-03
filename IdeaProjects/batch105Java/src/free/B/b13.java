package free.B;

import java.util.Arrays;

public class b13 {
    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 8};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+2;
        }
        System.out.println(Arrays.toString(arr));
        arr=elementleri2Artir(arr);
    }
    public static int[]elementleri2Artir(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+2;
        }
        return arr;
    }
}





