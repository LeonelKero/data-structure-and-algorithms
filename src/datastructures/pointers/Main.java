package datastructures.pointers;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        map1.put("value", 1);

        map2 = map1;
        System.out.println("Update Map 1 value to 42");
        map1.put("value", 42);

        System.out.println("Map 1 = " + map1);
        System.out.println("Map 2 = " + map2);
    }
}
