package free.map;

import java.util.HashMap;
import java.util.Map;

public class A {
    public static void main(String[] args) {
        Map<String, Integer> arac = new HashMap<>();
        arac.put("BMW", 5);
        arac.put("Mercedes", 3);
        arac.put("Audi", 4);
        arac.put("Ford", 10);
        System.out.println();


        for (String key : arac.keySet())
            System.out.println(key + " - " + arac.get(key));
        System.out.println();

        String searchKey = "Audi";
        if (arac.containsKey(searchKey))
            System.out.println("Found total " + arac.get(searchKey) + " " + searchKey + " cars!\n");

        // Clear all values.
        arac.clear();

        // Equals to zero.
        System.out.println("After clear operation, size: " + arac.size());
    }
}
