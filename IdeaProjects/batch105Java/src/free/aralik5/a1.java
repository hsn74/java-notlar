package free.aralik5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class a1 {
    public static void main(String[] args) {
        Map<String,Object>bookingdatesMap=new HashMap<>();
        bookingdatesMap.put("checkin","2021-06-01");
        bookingdatesMap.put("checkout","2021-06-10");

        Map<String,Object> requestBodyMap=new HashMap<>();
        requestBodyMap.put("firstname","Ahmet");
        requestBodyMap.put("lastname","Bulut");
        requestBodyMap.put("totalprice",500);
        requestBodyMap.put("depositpaid",false);
        requestBodyMap.put("bookingdates",bookingdatesMap);
        requestBodyMap.put("additionalneeds","wi-fi");
        System.out.println((Map)requestBodyMap.get("depositpaid"));

        System.out.println(requestBodyMap.get("bookingdates"));

        System.out.println(((Map) (requestBodyMap.get("bookingdates"))).get("checkin"));
        System.out.println(((Map) (requestBodyMap.get("bookingdates"))).get("checkout"));

    }

}


