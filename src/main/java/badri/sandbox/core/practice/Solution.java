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
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Antenna", 40000));
        productList.add(new Product("Smartphone", 20000));
        productList.add(new Product("Beer", 10000));

        productList.sort(Product.byName);

        for (Product p : productList) {
            System.out.println(p);
        }
    }
}