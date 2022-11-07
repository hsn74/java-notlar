package free;

import java.util.Locale;

public class equalsignore {
    public static void main(String[] args) {

        String str1="MATEMATİK";
        String str2="MATematik";
        String str3="matEMATik";
        String str4="MATEMATİK";
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str1));
    }
}
