package free.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A4 {
    public static void main(String[] args) {
        int [] arr={2,3,5,1,3,5,7,8,4,9,0,4,2,5,1,5,7};
        List<Integer>sayilar=new ArrayList<>();
        for (Integer each:arr
             ) {
            sayilar.add(each);
            System.out.println(arr);
        }
                
}
}
