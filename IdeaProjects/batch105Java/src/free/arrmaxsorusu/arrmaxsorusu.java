package free.arrmaxsorusu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrmaxsorusu {
    public static void main(String[] args) {
        int [] arr = {5, 6, 76, 31, 43, 1,4,7,13,41,43,78,97};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}

