package Ders09_StringManupulations;

import javax.sound.midi.Soundbank;
import java.util.Locale;

public class C01_ToUpperCase {
    public static void main(String[] args) {
        String str="Java Mutluluktur";
        System.out.println(str.toUpperCase());
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);
        str="ince mehmet";
        str=str.toUpperCase();
        System.out.println(str);
        str=str.toLowerCase();
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
