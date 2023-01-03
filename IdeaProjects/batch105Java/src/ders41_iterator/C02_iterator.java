package ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        Iterator it1=sayilar.iterator();
        // tum elementleri iterator kullanarak yazdiralim
        System.out.println(it1.hasNext());//true
        System.out.println(it1.next());//10
        System.out.println(it1.hasNext());//true
        System.out.println(it1.next());//20
        // iterator nereye kadar iterate ettiysek orada kalir
        // bastan itibaren yazdirmak isterseniz, yeni bir iterator olusturmaniz gerekir



        System.out.println("========");
        while (it1.hasNext()){
            System.out.println(it1.next());
            Iterator it2=sayilar.iterator();
            System.out.println("========");
            while (it2.hasNext()){
                System.out.println(it2.next());
            }
        }
    }
}
