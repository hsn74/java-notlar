package free.A;

import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        String str="vah vah vah ki ne vah";
        String[] aArrray=str.split("v");
        String [] aArray=str.split("a");
        System.out.println(str);
        System.out.println(Arrays.toString(aArray));
    }
}
