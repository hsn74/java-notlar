package free.map;

import java.util.Map;
import java.util.TreeMap;

public class F {
    public static void main(String[] args) {
            // Creating Map using TreeMap
            Map<String, Integer> values = new TreeMap<>();

            // Insert elements to map
            values.put("Second", 2);
            values.put("First", 1);
            values.put("third",3);
        System.out.println("values:"+values);

        // Replacing the values
        values.replace("third",5);
        values.replace("First", 11);
        values.replace("Second", 22);
        System.out.println("New Map: " + values);
        //values:{First=1, Second=2, third=3}
        //New Map: {First=11, Second=22, third=5}

        // Remove elements from the map
        // Remove elements from the map
        int removedValue=values.remove("third");
        System.out.println(removedValue);
        System.out.println(values.keySet());
    }
}



