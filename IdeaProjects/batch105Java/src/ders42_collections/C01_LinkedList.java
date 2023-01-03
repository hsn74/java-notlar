package ders42_collections;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList<>();
        // LinkedList 3 tane interface'i implements etmistir
        // List, Queue, Deque interfaceleri
        // Dolayisiyla bu interface'lerden sonra gelen ilk concrete class oldugundan
        // Bu 3 interface'deki tum abstract method'lari override etmistir

        // LinkedList olusturulurken secilen data turune gore
        // bu 3 interface'den birinin ozelliklerini alabilir
        // veya data turu LinkedList secilirse, 3 interface'in ozelliklerini de toptan alir

        List<String> ll2 = new LinkedList<>();

        // Daha onceden arrayList olustururken, List<> interface'ini data turu olarak kullandigimizdan
        // bu sekilde olusturulan LinkedList'lerin ozelliklerini biliyoruz
        ll2.add("R");
        System.out.println(ll2);
        ll2.add("Z");
        System.out.println(ll2);
        ll2.add(0,"A");
        ll2.add(2,"A");
        System.out.println(ll2.get(1));
        System.out.println(ll2);
        ll2.retainAll(ll1);
        System.out.println(ll2.retainAll(ll1));

    }
}
