package free.map;

import java.math.BigDecimal;
import java.util.*;

public class G {
    public static void main(String[] args) {
        HashMap < Integer, String > hm = new HashMap < Integer, String > ();
        hm.put (11, "Sachin");
        hm.put (37, "Dhoni");
        hm.put (25, "Kohli");
        hm.put (13, "Raina");
        hm.put (12, "Yuvraj");
        System.out.println (hm);
        System.out.println(hm.size());
        Set ks=hm.keySet();
        System.out.println(ks);
       Collection cv=hm.values();
       System.out.println (cv);
       Set entry=hm.entrySet();
        System.out.println(entry);
        System.out.println(hm.containsKey(13));
        System.out.println (hm.remove (25));




    }
}
