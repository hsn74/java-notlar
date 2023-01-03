package free.map;

import java.util.HashMap;
import java.util.Map;

public class B {
    public static void main(String[] args) {
        // Creating a map using the HashMap
        Map<String, Integer> sayilar = new HashMap<>();
        // Insert elements to the map
        sayilar.put("one", 1);
        sayilar.put("two", 2);
        System.out.println( sayilar);
        // Access keys of the map
        System.out.println("Keys: " + sayilar.keySet());

        // Access values of the map
        System.out.println("Values: " + sayilar.values());
        // Access entries of the map
        System.out.println("Entries: " + sayilar.entrySet());
        // Remove Elements from the map
        int value = sayilar.remove("Two");
        System.out.println("Removed Value: " + value);





    }
}




