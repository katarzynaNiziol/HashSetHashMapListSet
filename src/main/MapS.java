package main;

import java.util.*;

public class MapS {
    public static void main(String[] args) {
        Map<String, String> nameToMeal = new HashMap();

        nameToMeal.put("Mariusz", "Pizza");
        nameToMeal.put("Radek", "Burger");
        nameToMeal.put("Mateusz", "Pizza");

        System.out.println(nameToMeal.get("Radek"));
        System.out.println(nameToMeal.containsValue("Pizza"));

        Set<String> keys = nameToMeal.keySet();
        for (String key : keys) {
            System.out.println(key);

        }
        Collection<String> values = nameToMeal.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
