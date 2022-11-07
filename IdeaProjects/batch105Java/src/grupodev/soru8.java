package grupodev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru8 {
    public static void main(String[] args) {
        /*Write a program that deletes the letters 'a' from the names in the list given
         *  * as input.
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         *​ OUTPUT : ​ [Veli,Omer]*/

        List<String> arr = new ArrayList<>();
        //String[] list1 = {"Ali", "Veli", "Ayse", "Fatma", "Omer"};//[Veli,Omer]
        arr.add("Ali");
        arr.add("Veli");
        arr.add("Ayse");
        arr.add("Omer");
        System.out.println(arr);
        String str=arr.remove(0);
        System.out.println(arr);
        String str1=arr.remove(1);
        System.out.println(arr);

        }

    }



