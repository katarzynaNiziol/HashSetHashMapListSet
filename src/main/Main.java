package main;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> meals = new HashSet<>();

        meals.add("Pizza");
        meals.add("Burger");
        meals.add("Pizza");
        meals.add("Salad");

        for(String meal : meals) {
            System.out.println(meal);
        }
    }
}
