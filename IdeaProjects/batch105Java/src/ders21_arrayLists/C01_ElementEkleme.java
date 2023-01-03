package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ElementEkleme {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        System.out.println(sayilar);
        sayilar.add(822);
        sayilar.add(10);
        System.out.println(sayilar);
        sayilar.add(20);
        System.out.println(sayilar);
        sayilar.add(1,4478);
        sayilar.add(0,44);
        System.out.println(sayilar);
        List<Integer>eklenecekListe=new ArrayList<>();
        eklenecekListe.add(3);
        eklenecekListe.add(5);
        sayilar.addAll(eklenecekListe);
        System.out.println(sayilar);

    }
}
