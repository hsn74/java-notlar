package free.karişik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator1 {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(25);
        sayilar.add(35);
        sayilar.add(40);
        // iterator kullanarak bu listeden 15 ile 35 arasindaki sayilari silin
        // tum elementleri iterator yardimi ile silelim
        Iterator it1 = sayilar.iterator();
        Integer element;

        while ((it1.hasNext())) {
            element = (Integer) it1.next();
            if (element < 12 && element > 30) {
                it1.remove();
        }
        System.out.println(sayilar);//[10, 40]
    }
    }
}
