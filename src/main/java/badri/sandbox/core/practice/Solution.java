package badri.sandbox.core.practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();

        cities.add(new City("Sukhum", 60000));
        cities.add(new City("Gagra", 20000));

        Collections.sort(cities);

        for (City city : cities) {
            System.out.println(city);
        }
    }
}