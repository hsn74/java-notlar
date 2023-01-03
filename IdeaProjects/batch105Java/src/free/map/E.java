package free.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class E {
    public static void main(String[] args) {
            // Creating a map using the HashMap
            TreeMap<String, Integer> numbers = new TreeMap<>();
            // Insert elements to the map
            numbers.put("One", 1);
            numbers.put("Two", 2);
            numbers.put("tree",3);
            numbers.put("four",4);
            System.out.println("Map: " + numbers);

            // Access keys of the map
        System.out.println(numbers.keySet());

        // Access values of the map
        System.out.println("Values: " + numbers.values());
        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        // Remove Elements from the map

        System.out.println(numbers.entrySet());


    }
    }
