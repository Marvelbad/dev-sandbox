package badri.sandbox.core.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Badri", "Alex", "Aleksander", "Sergey", "Tom");
        List<String> resultNames = names.stream()
                .filter(s-> s.length() > 3)
                .map(String::toUpperCase)
                .toList();
        resultNames.forEach(System.out::println);

    }
}