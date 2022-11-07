package free;

import java.util.Locale;

public class substring1 {
    public static void main(String[] args) {
        String str = "her gün daha kötü";
        System.out.println(str.substring(1, 3));
        String isim="HÜSEYİN";
        isim=isim.substring(1,5).toUpperCase(Locale.ROOT)
                +isim.substring(1).length();
        System.out.println(isim.substring(1,5));
        isim=isim.substring(1,5).toUpperCase(Locale.ROOT)+
    isim.toLowerCase(Locale.ROOT).length();
        System.out.println(isim);


    }

    }

